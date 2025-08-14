package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductShippingPage {

	//1. create object of web driver
		WebDriver ldriver;

		//constructor
		public ProductShippingPage(WebDriver rdriver)
		{
			ldriver = rdriver;


			PageFactory.initElements(rdriver, this);
		}

	@FindBy(id = "cgv")
	WebElement checkbox;
	
	@FindBy(name = "processCarrier")
	WebElement ProceedtoCheckout;
	
	public void ClickonCheckbox() {
		checkbox.click();
		
	}
	public void ClickonProceedtocheckout() {
		ProceedtoCheckout.click();
		
	}
}
