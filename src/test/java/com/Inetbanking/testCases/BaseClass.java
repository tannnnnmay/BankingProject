package com.Inetbanking.testCases;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.Inetbanking.utilities.Readfile;

public class BaseClass {
	
	Readfile read = new Readfile();
	
	public String baseUrl =read.getUrl();
	public String username =read.getUsername();
	public String password =read.getPassword();
	public static WebDriver driver;
	public static Logger logger;
	@BeforeClass 
	// Suppose baseclass is extended then this method will execute before class execution.
	public void setup() 
	{
		System.setProperty("webdriver.chrome.driver",read.getChromePath());
		driver = new ChromeDriver(); //instiansiation
		logger= Logger.getLogger("ebanking");
		PropertyConfigurator.configure("Log4j.properties");
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	

}
