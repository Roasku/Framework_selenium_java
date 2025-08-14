package extentReport;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.SkipException;

import org.testng.annotations.*;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Extentreport {

	ExtentSparkReporter htmlReporter;
	ExtentReports reports;
	ExtentTest test;

	@BeforeTest
	public void startReport() {

		htmlReporter=new ExtentSparkReporter("ExtentReportDemo.html");
		reports=new ExtentReports();
		reports.attachReporter(htmlReporter);


		// add environment details  

		reports.setSystemInfo("Machine","testPC1");
		reports.setSystemInfo("OS", "Window 11");
		reports.setSystemInfo("user","Abhishek");
		reports.setSystemInfo("Browser","chrome");

		// configuration to change look and feel .............

		htmlReporter.config().setDocumentTitle("ExtentReportDemo");
		htmlReporter.config().setReportName("Test Report");
		htmlReporter.config().setTheme(Theme.STANDARD);
		htmlReporter.config().setTimeStampFormat("EEEE ,MMM dd ,yyyy ,hh.mm a '('zzz')");

	}
	@Test
	public void launchBrowser() {
		// create test
		test=reports.createTest("Launch browser and open url");
		Assert.assertTrue(true); // test passed


	}
	@Test
	public void varifyTitle() {
		// create test
		test=reports.createTest("varify title");
		Assert.assertTrue(false); // test fail 

	}
	@Test
	public void varifyLogo() {
		// create test
		test=reports.createTest("varify Logo");
		Assert.assertTrue(true); // test passed

	}
	@Test
	public void varifyEmail() {
		// create test
		test=reports.createTest("varify emial");
		throw new SkipException("skip test case with exception.");

	}
	@Test
	public void varifyUsername() {
		// create test
		reports.createTest("varify Username");
		Assert.assertTrue(true); // test pass

	}
	@AfterMethod
	public void getTestResult(ITestResult result) {

		if (result.getStatus()==ITestResult.FAILURE)
		{
			test.log( Status.FAIL ,MarkupHelper.createLabel(result.getName()+"Fail",ExtentColor.RED));
		}

		else if (result.getStatus()==ITestResult.SUCCESS) {
			test.log( Status.PASS ,MarkupHelper.createLabel(result.getName()+"Pass",ExtentColor.GREEN));

		}
		else if (result.getStatus()==ITestResult.SKIP){}

		test.log( Status.SKIP ,MarkupHelper.createLabel(result.getName()+"Skip",ExtentColor.ORANGE));

	}
	@AfterTest
	public void tearDown() {

		reports.flush();


	}




}
