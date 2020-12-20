package com.telecom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TariffPlanPage {

	private WebDriver driver;
	private WebDriverWait wait;
	
	@FindBy(name="rental")
	private WebElement rentalTxt;
	
	@FindBy(name="local_minutes")
	private WebElement localMinutesTxt;
	
	@FindBy(name="inter_minutes")
	private WebElement interMinutesTxt;
	
	@FindBy(name="sms_pack")
	private WebElement smsPackTxt;
	
	@FindBy(name="minutes_charges")
	private WebElement minutesChargesTxt;
	
	@FindBy(name="inter_charges")
	private WebElement interChargesTxt;
	
	@FindBy(name="sms_charges")
	private WebElement smsChargesTxt;
	
	@FindBy(name="submit")
	private WebElement submitBtn;
	
	public TariffPlanPage(WebDriver driver)
	{
		this.driver = driver;
		this.wait = new WebDriverWait(driver, 30);
		PageFactory.initElements(driver, this);
	}
	
	public void crateTariff(String monthRental, String freeLocalMin, String freeIntrMin, String freeSmsPack, String localMinCharges, String intrMinCharges, String smsPerCharges)
	{
		wait.until(ExpectedConditions.visibilityOf(this.rentalTxt));
		this.rentalTxt.sendKeys(monthRental);
		this.localMinutesTxt.sendKeys(freeLocalMin);
		this.interMinutesTxt.sendKeys(freeIntrMin);
		this.smsPackTxt.sendKeys(freeSmsPack);
		this.minutesChargesTxt.sendKeys(localMinCharges);
		this.interChargesTxt.sendKeys(intrMinCharges);
		this.smsChargesTxt.sendKeys(smsPerCharges);
		
	}
	
	public void submitTariff()
	{
		this.submitBtn.click();
	}
	
}
