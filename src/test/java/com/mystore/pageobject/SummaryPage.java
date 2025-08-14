package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SummaryPage {


	//1. create object of web driver
	WebDriver ldriver;

	//constructor
	public SummaryPage(WebDriver rdriver)
	{
		ldriver = rdriver;


		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "//a[@class=\"button btn btn-default standard-checkout button-medium\"]")
	WebElement proceedtocheckOutbutton;
	
	

	public void clickoncheckoutbutton() {
		proceedtocheckOutbutton.click();
		
	}
}
