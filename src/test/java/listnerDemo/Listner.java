package listnerDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners(listnerDemo.Listnerclass.class)
public class Listner {

	@Test
	public void login() {
		
    WebDriverManager.chromedriver().setup();
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
	
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");

	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	
	
	driver.findElement(By.id("btnLogin")).submit();
	
	Assert.assertEquals(driver.getTitle(),"OrangeHRM");
	
	}
	
	@Test
	public void testFail() {
		
		System.out.println("Failed test case");
		Assert.assertTrue(false);
	}	
	@Test
		public void testPass() {
			
		System.out.println("Passed test case");
		Assert.assertTrue(true);
		
	}
	@Test
		public void testSkiped() {
			
			System.out.println("Skipped test cases");
			throw new SkipException("Skip exception throw");
		}

}