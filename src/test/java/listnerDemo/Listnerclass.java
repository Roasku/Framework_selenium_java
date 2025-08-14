package listnerDemo;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listnerclass implements ITestListener {

	
	public void onStart(ITestContext Result) {
		
		System.out.println("On start method invoked ...");
	}
	
    public void onFinished(ITestContext Result) {
		
		System.out.println("On finish method invoked ...");
		
	}
    
    public void onTestpassed(ITestResult Result) {
		
		System.out.println("Name of test method passed ..."+Result.getName());
	}
    
	public void onTestinvoked(ITestResult Result) {
		
		System.out.println("Name of invoked test method"+Result.getName());
	}
	
    public void onTestfailed(ITestResult Result) {
		
		System.out.println("name of failed  test method"+Result.getName());
	}
    
    
}

