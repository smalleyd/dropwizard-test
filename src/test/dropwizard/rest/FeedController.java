package test.dropwizard.rest;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import test.dropwizard.HelloWorldConfiguration;
import test.dropwizard.value.FeedValue;

/** RESTful controller that provides web access to the Feed service.
 * 
 * @author smalleyd
 * @version 1.0
 * @since 10/29/2014
 *
 */

@Path("/feed")
@Produces(MediaType.APPLICATION_JSON)
public class FeedController
{
	private final HelloWorldConfiguration conf;

	/** Populator. */
	public FeedController(HelloWorldConfiguration conf)
	{
		this.conf = conf;
	}

	@GET
	public FeedValue get(@QueryParam("description") @DefaultValue("Sample Description") String description)
	{
		return new FeedValue(conf.getFeedName(), conf.getFeedUrl(), description);
	}
}
