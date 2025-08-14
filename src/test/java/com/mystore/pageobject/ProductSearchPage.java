package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ProductSearchPage {

	//1. create object of web driver
	WebDriver ldriver;

	//constructor
	public ProductSearchPage(WebDriver rdriver)
	{
		ldriver = rdriver;


		PageFactory.initElements(rdriver, this);
	}
//	
//		
		
		@FindBy(id = "search_query_top")
		WebElement clicksearchtextfield;
		
	@FindBy(id = "search_query_top")
	WebElement enterProduct;
	
	
	
	@FindBy(name =  "submit_search")
	WebElement searchButton;
	
	@FindBy(linkText = "Printed Summer Dress")
	WebElement clickonProduct;
	
	
//	@FindBy(linkText = "More")
//	WebElement moreButton;
//	
	@FindBy(id = "group_1")
	WebElement sizebutton;
	
	@FindBy(xpath = "//i[@class=\"icon-plus\"]")
	WebElement increaseQuantity;
	
	@FindBy(name = "Submit")
	WebElement addtoCart;
	
	@FindBy(linkText = "Proceed to checkout")
	WebElement checkoutButton;
	
	@FindBy(xpath = "(//a[@title=\"Faded Short Sleeve T-shirts\"])[2]")
	WebElement mouseHoverTshirtproduct;
	
	@FindBy(xpath = "//a[@class=\"add_to_compare\"]")
	WebElement AddtoComapare;
	
	// create method for action .......
	
	public void clickinsearchTextfield() {
		
		clicksearchtextfield.click();
	}
	public void enterProduct(String prodname) {
		enterProduct.sendKeys(prodname);
		
	}
	
	public void clickonSearchbutton() {
		searchButton.click();
		
	}
	
	public  void clickonProduct() {
		clickonProduct.click();
		
	}

//	public void clickonmorebutton() {
//		moreButton.click();
//		
//	}
//	
	public void clickonSizebutton() {
		sizebutton.click();
		
	}
	public void enterSize(String value) {
		
		Select sel = new Select(sizebutton);
		sel.selectByValue(value);
	}
	
	public void increaseQuantity() {
		increaseQuantity.click();
		
	}
	public void clickonAddtocart() {
		addtoCart.submit();
		
	}
	public void clickonCheckoutButton() {
		checkoutButton.submit();
		
	}	
	
	public void mouseoveronTshirt() {
		Actions act = new Actions(ldriver);
		act.moveToElement(mouseHoverTshirtproduct);
	}	
		public void clickOnaddToComapare() {
			AddtoComapare.click();
			
		}
	
}
