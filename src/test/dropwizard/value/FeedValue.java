package test.dropwizard.value;

import java.io.Serializable;

/** Value object that represents the details of a feed.
 * 
 * @author smalleyd
 * @version 1.0
 * @since 10/29/2014
 *
 */

public class FeedValue implements Serializable
{
	/** Constant - serial version UID. */
	public static final long serialVersionUID = 1L;

	/** Represents the feed name. */
	public String getName() { return name; }
	private String name = null;

	/** Represents the feed URL. */
	public String getUrl() { return url; }
	private String url = null;

	/** Represents the feed description. */
	public String getDescription() { return description; }
	private String description = null;

	/** Populator.
	 * 
	 * @param name
	 * @param url
	 * @param description
	 */
	public FeedValue(String name, String url, String description)
	{
		this.name = name;
		this.url = url;
		this.description = description;
	}
}
