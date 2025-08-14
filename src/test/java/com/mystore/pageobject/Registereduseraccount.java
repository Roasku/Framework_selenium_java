package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registereduseraccount {

	WebDriver ldriver;
	
	
	  public Registereduseraccount(WebDriver rdriver)
	 
	 {
		
		 ldriver = rdriver;
		
		 PageFactory.initElements(rdriver,this);	 
		 
	}
	 
		 // identify web element............
		 
		 @FindBy(xpath="//a[@title='View my customer account']")
		 
		 WebElement useraccountname;
		 
		 @FindBy(linkText = "Sign out")
		WebElement signoutuserAcct;
		 
//	methods for action ....................................
		 
		 public String getuserName() {
			 String text = useraccountname.getText();
			 
			 return text;
		 }
		 
		 public void clickonSignout() {
			 
			 signoutuserAcct.click();
		 }
	
}
