package test.dropwizard;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

import test.dropwizard.rest.FeedController;

/** Application entry point. Accepts the Dropwizard configuration first.
 * 
 * @author smalleyd
 * @version 1.0
 * @since 10/29/2014
 *
 */

public class HelloWorldApplication extends Application<HelloWorldConfiguration>
{
	/** Application entry point. */
	public static void main(String[] args) throws Exception
	{
		new HelloWorldApplication().run(args);
	}

	@Override
	public String getName() { return "Hello Feed World"; }

	@Override
	public void initialize(Bootstrap<HelloWorldConfiguration> bootstrap)
	{

	}

	@Override
	public void run(HelloWorldConfiguration conf,
			Environment env) throws Exception
	{
		System.out.println("Feed Name: " + conf.getFeedName());
		System.out.println("Feed URL: " + conf.getFeedUrl());
		
		env.jersey().register(new FeedController(conf));
	}
}
