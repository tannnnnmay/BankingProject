package com.Inetbanking.testCases;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.Inetbanking.Pageobjects.LoginPage;
public class TC_LoginTest_001 extends BaseClass {
	
	// here setup method will execute first
	@Test
	public void loginTest() throws InterruptedException {
		
		 driver.get(baseUrl);
		 logger.info("Url is entered");
		 LoginPage lp = new LoginPage(driver);
		 lp.setUsername(username);
		 lp.setPassword(password);
		 logger.info("Password is entered");
		 lp.clickSubmit();
		 logger.info("Login button is clicked");
		 Thread.sleep(2000);
		 
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
			 logger.info("Login Test is passed");
		}else
		{
			Assert.assertTrue(false);
			 logger.info("Login Test is failed");
		 } 
		
	}

}
