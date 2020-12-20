package com.tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {

protected WebDriver driver;
	
	@BeforeTest
	public void launchBrowser(ITestContext ctx) throws MalformedURLException
	{
		String host = "localhost";
		DesiredCapabilities dc;
		
		if(System.getProperty("BROWSER")!=null &&
				System.getProperty("BROWSER").equalsIgnoreCase("firefox"))
		{
			dc = DesiredCapabilities.firefox();
		}else
		{
			dc = DesiredCapabilities.chrome(); 
		}
		
		if(System.getProperty("HUB_HOST")!=null)
		{
			host = System.getProperty("HUB_HOST");
		}
		
		
		String testName = ctx.getCurrentXmlTest().getName();
		System.out.println("Test Case Name : " + testName);
		dc.setCapability("name", testName);
		String completeUrl = "http://" + host + ":4444/wd/hub";
		this.driver = new RemoteWebDriver(new URL(completeUrl),dc);
	}
	
	
	
	@AfterTest
	public void tearDown()
	{
		this.driver.quit();
	}
	
}
