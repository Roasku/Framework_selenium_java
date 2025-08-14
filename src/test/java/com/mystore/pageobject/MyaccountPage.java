package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyaccountPage {

	WebDriver ldriver;
	
	
	  public MyaccountPage(WebDriver rdriver)
	 
	 {
		
		 ldriver = rdriver;
	 	
		 PageFactory.initElements(rdriver,this);	 
		 
	}
	 
		 // identify web element............
		 
		 @FindBy(id="email_create")
		 
		 WebElement creatEmail;
		 
		 @FindBy(id= "SubmitCreate")
		 WebElement  submitcreate;
		 
//	For already created account .....


//         @FindBy(id="email")
//		 
//	  	 WebElement removeEmail;
         
         @FindBy(id="email")
		 
	  	 WebElement AlreadycreatEmail;
         
//         @FindBy(id="passwd")
//		 
//	  	 WebElement remPasswd;
         
         @FindBy(id="passwd")
		 
	  	 WebElement enterPass;
		 
         @FindBy(id="SubmitLogin")
		 
	  	 WebElement Signin;
         
        
//	methods for action ....................................
		 
		 public void createEmail(String emailAdd) {
			 creatEmail.sendKeys(emailAdd);
			 
		 }
		 
		 public void submitCreate() {
			 
			 submitcreate.click();
		 }
		
//	Method for 	 already registered account details ......
		 
//       public void remEmail() {
//			 
//    	   removeEmail.clear();
//			 
//		 }
		 public void entercreateEmail(String email) {
			 
			 AlreadycreatEmail.sendKeys(email);
			 
		 }
		 
//		  public void remvPasswd() {
//				 
//			  remPasswd.clear();
//				 
//			 }
			 
        public void enterpasswd(String pass) {
			 
        	enterPass.sendKeys(pass);
			 
		 }
		 
        public void signin() {
			 
        	Signin.click();
			 
		 }
	}

