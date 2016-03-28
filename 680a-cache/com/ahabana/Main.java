
package com.ahabana;

import org.testng.annotations.Test;

public class Main
{
	/*
	 * Validate freemarker error for prime
	 */
	@Test
	public void test()
	{
		
		// check 10 times
		int count = 0;
		while ( count < 10 )
		{			
			// create instance
			Firefox firefox = new Firefox();
			firefox.navigate680a();

			// validate checkpoint
			String status = firefox.checkpoint1();
			
			// fail test if checkpoint fails			
			if ( status.equals("Fail") )
			{
				org.testng.Assert.fail();
			}
			
			// increment count
			count++;
			
			// close browser
			firefox.teardown();
		}
	}
}
