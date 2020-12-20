package com.telecom.tests;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.telecom.pages.AddCustomerPage;
import com.telecom.pages.HomePage;
import com.tests.BaseTest;

public class AddCustomerTest extends BaseTest {
	
	
	private WebDriverWait wait;
	private HomePage home ;
	private AddCustomerPage addCustomer;

	
	@Test
	public void createCustomerTestCase() throws InterruptedException
	{
		home = new HomePage(driver);
		addCustomer = new AddCustomerPage(driver);
		home.goTo();
		home.navigateToAddCustomer();
		addCustomer.addCustomerDetails("Shawn", "SM", "shawn@abc.com", "London", "9898989898");
		//addCustomer.createCustomer();
		Thread.sleep(5000);
	}
}
