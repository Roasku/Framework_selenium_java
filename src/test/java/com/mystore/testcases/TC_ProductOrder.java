package com.mystore.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.mystore.pageobject.MyaccountPage;
import com.mystore.pageobject.ProductAddressPage;
import com.mystore.pageobject.ProductShippingPage;
import com.mystore.pageobject.ProductpaymentPage;
import com.mystore.pageobject.Registereduseraccount;
import com.mystore.pageobject.SummaryPage;
import com.mystore.pageobject.indexPage;

public class TC_ProductOrder extends BaseClass {

	@Test
	public void ToverifyOrderproduct() throws InterruptedException, IOException  {
		
		indexPage pg = new indexPage(driver);  // ..................
		driver.manage().window().maximize();
		pg.clickOnSignIn();
		logger.info("Sign in button is clickable");
		
		 MyaccountPage pg1 = new MyaccountPage(driver);  // .................
			
//	    pg1.remEmail();
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
		
//		regUser.clickonSignout();
		}
		
	@AfterMethod
	public void Toverifyproductorder() throws InterruptedException {
		
		TC_By_Product b1 = new TC_By_Product();
		b1.ToverifybuyProduct();
		
		Thread.sleep(2000);
		SummaryPage s1 = new SummaryPage(driver);
		s1.clickoncheckoutbutton();
		logger.info("Proceed to checkout button is clicked");
		ProductAddressPage p1 = new ProductAddressPage(driver);
		p1.clickonProceedtocheckoutButton();
		logger.info("Proceed to check button is clicked");
		ProductShippingPage ps = new ProductShippingPage(driver);
		ps.ClickonCheckbox();
		logger.info("Checkbox is selected");
		ps.ClickonProceedtocheckout();
		logger.info("Button is clicked");
		
		ProductpaymentPage pm = new ProductpaymentPage(driver);
		pm.clickonbankwirePay();
		logger.info("bank is selected");
		pm.clickonconfirmmyOrder();
		logger.info("order is confirmed");
		
	}
		
}
