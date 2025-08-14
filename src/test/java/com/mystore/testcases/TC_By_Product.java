package com.mystore.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.mystore.pageobject.MyaccountPage;
import com.mystore.pageobject.ProductSearchPage;
import com.mystore.pageobject.Registereduseraccount;
import com.mystore.pageobject.indexPage;

public class TC_By_Product extends BaseClass {

	@Test
	public void verifyalreadyregtlogin() throws IOException, InterruptedException	{

		indexPage pg = new indexPage(driver);  // ..................
		driver.manage().window().maximize();
		pg.clickOnSignIn();
		logger.info("Sign in button is clickable");

		MyaccountPage pg1 = new MyaccountPage(driver);  // .................

		//    pg1.remEmail();
		Thread.sleep(2000);
		pg1.entercreateEmail("abbhishek178@gmail.com");
		logger.info("email address is entered in email text field..");

		//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		Thread.sleep(3000);
		//	pg1.remvPasswd();
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

		//	regUser.clickonSignout();
	}

//	@AfterMethod
	public void ToverifybuyProduct() throws InterruptedException {

		ProductSearchPage p1 = new ProductSearchPage(driver);
		p1.clickinsearchTextfield();
		logger.info("search field is clickable");

		p1.enterProduct("T shirt");
		logger.info("T shirt is entere");
		p1.clickonSearchbutton();
		logger.info("product is displyed");

		p1.clickonProduct();
		logger.info("product is clicked");
		//		p1.clickonmorebutton();
		//		logger.info("More page is displayed ");
		//		
		Thread.sleep(2000);
		p1.clickonSizebutton();
		logger.info("button is clickable");

		p1.enterSize("3");
		logger.info("size is selected");

		p1.increaseQuantity();
		logger.info("Quantity is increased");
		Thread.sleep(2000);
		p1.clickonAddtocart();
		logger.info("Add to cart button is clickable");

		//		p1.clickonCheckoutButton();
		logger.info("proceed to checkout button is clicked");

	}
	
	@AfterTest
	public void ToverifyaddToComaparewithoutLogin() throws InterruptedException {

		logger.info("========Start add to comapare product ======");

		indexPage pg1 = new indexPage(driver);
		pg1.clickOnTShirtMenu();

		logger.info("mouse over ============");

		ProductSearchPage p1 = new ProductSearchPage(driver);

		p1.mouseoveronTshirt();

		logger.info(" mouse is overed on T shirt ");
//		Thread.sleep(2000);

		p1.clickOnaddToComapare();
		logger.info(" product is added for compare ");


	}
}
