package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Accountcreationdetailpage {

	//1. create object of web driver
		WebDriver ldriver;

		//constructor
		public Accountcreationdetailpage(WebDriver rdriver)
		{
			ldriver = rdriver;
			

			PageFactory.initElements(rdriver, this);
		}


		//identify web elements
		
			@FindBy(id= "uniform-id_gender2") 
			WebElement mrs;
		
		@FindBy(id="customer_firstname")
		WebElement custfname;
		
		@FindBy(id="customer_lastname")
		WebElement custlstname;
		
		@FindBy(id="passwd")
		WebElement pass;
		
		@FindBy(id="days")
		WebElement daydropdown;
		
		@FindBy(id="days")
		WebElement birthday;
		
		@FindBy(id="months")
		WebElement birthmonth;
		
		@FindBy(id="years")
		WebElement birthyear;
		
		@FindBy(id="newsletter")
		WebElement signup_checkbox;
		
		@FindBy(id="submitAccount")
		WebElement rigbutton;
//			
		//identify action on web element
		public void clickOnmrsradiobutton() {
			mrs.click();
		}
		
		public void enterFirstName(String fname) {
			custfname.sendKeys(fname);
		}
		
		public void enterLastName(String lname) {
			custlstname.sendKeys(lname);
		}
		
		public void enterPass(String passwd) {
			pass.sendKeys(passwd);
			
		}
		
		public void clickOndaydropdown() {
			daydropdown.click();
		}
		public void enterBirthDay(String value) {
			
			Select sel = new Select(birthday);
			sel.selectByValue(value);
			
		}
		
        public void enterBirthMonth(String value) {
			
			Select sel = new Select(birthmonth);
			
			sel.selectByValue(value);
			
		}
        
        public void enterBirthYear(String value) {
			
			Select sel = new Select(birthyear);
			sel.selectByValue(value);
			
		}
        
        public void clickOnsignupbutton() {
        	signup_checkbox.click();
        	
		}
		
        public void clickonregisterButton() {
        	rigbutton.click();
			
		}
		
		
		public String getPageTitle()
		{
			return(ldriver.getTitle());
		}
		
//		public void clickOnTShirtMenu()
//		{
//			tshirtMenu.click();
//		}
		
	}

