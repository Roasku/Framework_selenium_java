package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductAddressPage {




	//1. create object of web driver
	WebDriver ldriver;

	//constructor
	public ProductAddressPage(WebDriver rdriver)
	{
		ldriver = rdriver;


		PageFactory.initElements(rdriver, this);
	}

	@FindBy(name="processAddress")
	WebElement ProceedtoCheckoutButton;
	
	public void clickonProceedtocheckoutButton() {
		ProceedtoCheckoutButton.click();
		
	}
}


