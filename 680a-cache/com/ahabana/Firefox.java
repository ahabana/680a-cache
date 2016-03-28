
package com.ahabana;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;

public class Firefox extends Helper
{
	/*
	 * Constructor init firefox
	 */
	public Firefox()
	{
		driver = new FirefoxDriver();
		this.setDriver(driver);
	}

	/*
	 * Validate no freemarker template error
	 * by checking for one checkpoint
	 */
	public String checkpoint1()
	{
		// image xpath
		String image_680a = "//img[contains(@src,'jelly.png')]";

		// validate hero image
		if ( driver.findElement(By.xpath(image_680a)).isDisplayed() )
		{
			return "Pass";
		}
		else
		{
			return "Fail";
		}
	}

	/*
	 * Close browser
	 */
	public void teardown()
	{
		driver.close();
	}
}
