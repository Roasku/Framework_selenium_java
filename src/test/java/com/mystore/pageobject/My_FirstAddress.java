package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class My_FirstAddress {

	
	WebDriver ldriver;
	
	
	  public My_FirstAddress(WebDriver rdriver)
	 
	 {
		
		 ldriver = rdriver;
	 	
		 PageFactory.initElements(rdriver,this);	 
		 
	}
	  
//	   find elements ................
	  
//	 @FindBy(linkText = "Add my first address")
//	 WebElement MyfirstAddress;
//	 
	 @FindBy(xpath = "//a[@title=\"Add my first address\"]")
	 WebElement MyfirstAddress;
	 
	 @FindBy(id =  "company")
	 WebElement MyCompany;
	 
	 @FindBy(id =  "address1")
	 WebElement Address1;
	 
	 @FindBy(id =  "address2")
	 WebElement Address2;
	 
	 @FindBy(id =  "city")
	 WebElement City;
	 
	 @FindBy(id =  "id_state")
	 WebElement State; 
	 
	 
	 @FindBy(id =  "postcode")
	 WebElement postcode;
	 
	 
	 @FindBy(id =  "phone")
	 WebElement homephone;
	 
	 @FindBy(id =  "phone_mobile")
	 WebElement Mobilephone;
	 
	 @FindBy(id =  "other")
	 WebElement Additionalinformation;
	 
	 
	 @FindBy(id =  "alias")
	 WebElement ClearAddresstitle;
	 
	 @FindBy(id =  "alias")
	 WebElement EnterAddresstitle;
	 
	 @FindBy(id =  "submitAddress")
	 WebElement ClickSavebutton;
	
	 @FindBy(name = "processAddress")
	 WebElement proceedtocheckoutbutton;
	 
//	  create action method ...
	 
	 public void clickMyFirstAddress() {
		 MyfirstAddress.click();
		 
	 }
	 
	 public void enterCompany(String cname) {
		 MyCompany.sendKeys(cname);
		 
	 }
	 
	 public void enterAddress1(String Add1) {
		 Address1.sendKeys(Add1);
		 
	 }
	 public void enterAddress2(String Add2) {
		 Address2.sendKeys(Add2);
		 
	 }
	 public void enterCity(String city) {
		 City.sendKeys(city);
		 
	 }
	 public void enterState(String value) {
		Select sel = new Select(State);
		sel.selectByValue(value);
		 
	 }
	 public void enterPostcode(String pcode) {
		 postcode.sendKeys(pcode);
		 
	 }
	 
	 public void enterHomephone(String Hphone) {
		 homephone.sendKeys(Hphone);
		 
	 }
	 
	 public void enterMobilephone(String Mphone) {
		 Mobilephone.sendKeys(Mphone);
		 
	 }
	 
	 public void enterAddinformation(String Addinf) {
		 Additionalinformation.sendKeys(Addinf);
		 	 
	 }
	 
	 public void clarinformation() {
		 ClearAddresstitle.clear();
		 	 
	 }
	 public void enterAddresstitle(String Addtile) {
		 EnterAddresstitle.sendKeys(Addtile);
		 	 
	 }
	 
	 public void clickonsaveButton() {
		 ClickSavebutton.click();
		 	 
	 }
	 public void clickonProceedtocheckoutButton() {
		 proceedtocheckoutbutton.click();
		 
	 }
}
