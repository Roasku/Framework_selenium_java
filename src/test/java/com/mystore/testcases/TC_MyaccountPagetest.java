package com.mystore.testcases;


import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.*;

import com.mystore.pageobject.Accountcreationdetailpage;
import com.mystore.pageobject.My_FirstAddress;
import com.mystore.pageobject.MyaccountPage;
import com.mystore.pageobject.Registereduseraccount;
import com.mystore.pageobject.indexPage;

public class TC_MyaccountPagetest extends BaseClass {

	@Test(enabled = false)
	public void varifyRegistrationandlogin() {
		
//		driver.get(url);
//		logger.info("url opened");
//		
		indexPage pg = new indexPage(driver);  // ..................
		pg.clickOnSignIn();
		logger.info("Sign in button is clickable");

		MyaccountPage pg1 = new MyaccountPage(driver);  // .................
		
		pg1.createEmail("abbhishek178@gmail.com");
		logger.info("email address is entered in account creation page");
		pg1.submitCreate();
		logger.info("Submit button is clickable");
		
		Accountcreationdetailpage accdetail = new Accountcreationdetailpage(driver);  // .............
		accdetail.clickOnmrsradiobutton();
		accdetail.enterFirstName("Abhis");
		accdetail.enterLastName("kumar");
		accdetail.enterPass("Abhi1234");
		accdetail.enterBirthDay("30");
		accdetail.enterBirthMonth("12");
		accdetail.enterBirthYear("1996");
		
		accdetail.clickOnsignupbutton();
		logger.info("sign up check box is  selected");
		
		accdetail.clickonregisterButton();
		logger.info("registered botton is clickable");
				
		
		Registereduseraccount regUser = new Registereduseraccount(driver);
		String username = regUser.getuserName();
		
//		Assert class .......
		
		Assert.assertEquals("Abhis kumar", username);
		
//	 My First address .....
		
		My_FirstAddress adddetails = new My_FirstAddress(driver); // ........
		adddetails.clickMyFirstAddress();
		adddetails.enterCompany("LRS services");
		adddetails.enterAddress1("Losangles");
		adddetails.enterAddress2("Shicago");
		adddetails.enterCity("America");
		adddetails.enterState("9");
		
		logger.info("State is selected successfully");
		
		adddetails.enterPostcode("10025");
		adddetails.enterHomephone("0283677");
		adddetails.enterMobilephone("7895625487");
		adddetails.enterAddinformation("Test address through framework");
		adddetails.clarinformation();
		adddetails.enterAddresstitle("New Delhi");
		adddetails.clickonsaveButton();
		
		logger.info("Address save button is clickable ");
		
		adddetails.clickonProceedtocheckoutButton();
	}	
		
//		 Already registered account ...............
	@Test
		public void verifyalreadyregtlogin() throws IOException, InterruptedException	{
		
		indexPage pg = new indexPage(driver);  // ..................
		driver.manage().window().maximize();
		pg.clickOnSignIn();
		logger.info("Sign in button is clickable");
		
        MyaccountPage pg1 = new MyaccountPage(driver);  // .................
		
//        pg1.remEmail();
        Thread.sleep(2000);
		pg1.entercreateEmail("abbhishek178@gmail.com");
		logger.info("email address is entered in email text field..");
		
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(3000);
//		pg1.remvPasswd();
		Thread.sleep(2000);
		pg1.enterpasswd("Abhi1234");
		logger.info("passwd entered in pwd text field ..");
		Thread.sleep(3000);
		pg1.signin();
		
		logger.info("sign in button clickable");
		
		Registereduseraccount regUser = new Registereduseraccount(driver);
		String username = regUser.getuserName();
		
		if (username.equals("Abhi kumar")) {
			
			logger.info("verify login - passed");
			Assert.assertTrue(true);
		}
		
		else {
			logger.info("verify login - failed");
			captureScreenShot(driver, "verify login");

			Assert.assertTrue(false);
		} 
		Thread.sleep(2000);
		regUser.clickonSignout();
		}		
		
	}

