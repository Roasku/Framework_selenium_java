package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductpaymentPage {

	WebDriver ldriver;

	//constructor
	public ProductpaymentPage(WebDriver rdriver)
	{
		ldriver = rdriver;


		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath = "//a[@class=\"bankwire\"]")
	WebElement bankPay;
	
  	
	@FindBy (xpath = "(//button[@type=\"submit\"])[2]")
	WebElement confirmmyOrder;
	
	public void clickonbankwirePay() {
		
		bankPay.click();
	}
	
	public void clickonconfirmmyOrder() {
		
		confirmmyOrder.click();
	}
}
