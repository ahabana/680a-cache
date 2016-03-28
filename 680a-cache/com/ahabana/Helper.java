
package com.ahabana;

import org.openqa.selenium.WebDriver;

public class Helper
{
	// instance variables
	protected WebDriver driver;

	// setter
	public void setDriver(WebDriver driver)
	{
		this.driver = driver;
	}

	// getter
	public WebDriver getDriver()
	{
		return this.driver;
	}

	/*
	 * land on 680a page
	 */
	public void navigate680a()
	{
		// create url string
		StringBuilder url = new StringBuilder();
		url.append("http://");
		url.append("tstcpd202.");
		url.append("toyota.com/");
		url.append("upcoming-vehicles/");
		url.append("prius-prime/");		

		// go to url
		driver.get(url.toString());
	}
}
