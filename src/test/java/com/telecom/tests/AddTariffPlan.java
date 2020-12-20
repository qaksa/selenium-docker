package com.telecom.tests;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.telecom.pages.HomePage;
import com.telecom.pages.TariffPlanPage;
import com.tests.BaseTest;

public class AddTariffPlan extends BaseTest {
	

	
	private WebDriverWait wait;
	private HomePage home ;
	private TariffPlanPage tariffPlan;
	
	@Test
	public void addTariffPlanTestCase() throws InterruptedException
	{
		home = new HomePage(driver);
		tariffPlan = new TariffPlanPage(driver);
		home.goTo();
		home.navigateToAddTariffPlan();
		tariffPlan.crateTariff("200", "100", "100", "100", "100", "100", "100");
		Thread.sleep(5000);
		//tariffPlan.submitTariff();
		
		
	}
}
