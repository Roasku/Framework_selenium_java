package com.mystore.testcases;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
//import java.util.logging.LogManager;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
//import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import com.mystore.utilities.Readconfig;

import io.github.bonigarcia.wdm.WebDriverManager;

// all re-useable method create here .
public class BaseClass {

	  Readconfig readconfig= new Readconfig();
	  String    url= readconfig.getbaseUrl();
	  String browser=readconfig.getBrowser();
	  
	  public static WebDriver driver;
	  
	  public static Logger logger;
	  @BeforeClass
	  public void Setup() {
		  
		  switch (browser.toLowerCase()) {
		  
		  case "chrome":
			  WebDriverManager.chromedriver().setup();
			driver =  new ChromeDriver();
			break;
			
		  case "msedge":
			  WebDriverManager.edgedriver().setup();
			 driver= new EdgeDriver();
			 break;
			 
		  case "firefox":
			  WebDriverManager.firefoxdriver().setup();
			driver=  new FirefoxDriver();
			break;
			
		  default:
			  
			  driver=null;
			  break;
			  
		  
		  }
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  
//		  For logging ............
		  
		  logger =LogManager.getLogger("MyStoreV1");
      
		  // open url ...
		  driver.get(url);
		  logger.info("url opened");
	  }
	  
	  @AfterClass
	 public void tearDown()
	 {
//		 driver.close();
//		 driver.quit();
		 
		 
	 }
	  
	//user method to capture screen shot
	  
		public void captureScreenShot(WebDriver driver,String testName) throws IOException 
		{
			//step1: convert web driver object to TakesScreenshot interface
			TakesScreenshot screenshot = ((TakesScreenshot)driver);
			
			//step2: call getScreenshotAs method to create image file
			
			File src = screenshot.getScreenshotAs(OutputType.FILE);
			
			File dest = new File(System.getProperty("user.dir") + "//Screenshot//" + testName + ".png");
			
//			File dest = new File(System.getProperty("E:\\New folder\\Mystorev1") + "//Screenshot//" + testName + ".png");
		
			
			//step3: copy image file to destination
			FileUtils.copyFile(src, dest);
		}
	 
	  
}
