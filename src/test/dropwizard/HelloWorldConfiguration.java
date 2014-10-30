package test.dropwizard;

import io.dropwizard.Configuration;

/** Value object that represents the application bootstrap configurations.
 * 
 * @author smalleyd
 * @version 1.0
 * @since 10/29/2014
 *
 */

public class HelloWorldConfiguration extends Configuration
{
	/** Represents the main data source name. */
	public String getFeedName() { return feedName; }
	private String feedName = null;
	public void setFeedName(String newValue) { feedName = newValue; }

	/** Represents the main data source URL. */
	public String getFeedUrl() { return feedUrl; }
	private String feedUrl = null;
	public void setFeedUrl(String newValue) { feedUrl = newValue; }
}
