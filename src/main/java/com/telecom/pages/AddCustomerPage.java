package com.telecom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddCustomerPage {

	
	private WebDriver driver;
	private WebDriverWait wait;
	
	@FindBy(name="fname")
	private WebElement firstNameTxt;

	@FindBy(name="lname")
	private WebElement lastNameTxt;
	
	@FindBy(name="emailid")
	private WebElement emailIDTxt;
	
	@FindBy(xpath = "//*[@name='addr']")
	private WebElement addressTxt;
	
	@FindBy(name="telephoneno")
	private WebElement MbNumberTxt;
	
	@FindBy(name="submit")
	private WebElement submitBtn;
	
	public AddCustomerPage(WebDriver driver)
	{
		this.driver = driver;
		this.wait = new WebDriverWait(driver, 30);
		PageFactory.initElements(driver, this);
	}
	
	public void addCustomerDetails(String fname, String lname, String emailId, String addr, String mb)
	{
		wait.until(ExpectedConditions.visibilityOf(firstNameTxt));
		this.firstNameTxt.sendKeys(fname);
		this.lastNameTxt.sendKeys(lname);
		this.emailIDTxt.sendKeys(emailId);
		this.addressTxt.sendKeys(addr);
		this.MbNumberTxt.sendKeys(mb);
		
	}
	
	public void createCustomer()
	{
		this.submitBtn.click();
	}
}
