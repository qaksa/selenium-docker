package com.telecom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

	private WebDriver driver;
	private WebDriverWait wait;
	
	@FindBy(xpath="//a[text()='Add Customer']")
	private WebElement AddCustomerLink;
	
	@FindBy(xpath="//a[text()='Add Tariff Plan']")
	private WebElement AddTariffPlanLink;
	
	@FindBy(xpath="//a[text()='Add Tariff Plan to Customer']")
	private WebElement AddTariffPlanToCustomerLink;
	
	@FindBy(xpath="//a[text()='Pay Billing']")
	private WebElement PayBillingLink;
	
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
		this.wait = new WebDriverWait(driver, 30);
		PageFactory.initElements(driver, this);
	}
	
	public void goTo()
	{
		this.driver.get("http://demo.guru99.com/telecom/index.html");
		this.wait.until(ExpectedConditions.visibilityOf(this.AddCustomerLink));
	}
	
	public void navigateToAddCustomer()
	{
		
		/*this.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		this.driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);*/
		this.AddCustomerLink.click();
	}
	
	public void navigateToAddTariffPlan()
	{
		this.AddTariffPlanLink.click();
	}
	
	public void navigateToAddPlanToCustomer()
	{
		this.AddTariffPlanToCustomerLink.click();
	}
	
	public void navigateToPayBilling()
	{
		this.PayBillingLink.click();
	}
	
}
