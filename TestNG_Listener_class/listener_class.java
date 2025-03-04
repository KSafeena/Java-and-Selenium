package TestNG_Listener_class;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class listener_class implements ITestListener{
	public void onStart(ITestResult result) {					
       				
        	System.out.println("Started...");	
    }
	public void onTestStart(ITestResult result) {
	    System.out.println("Test started...");
	  }
	public void onTestFailure(ITestResult result) {
	    System.out.println("Test FAILED....");
	  }
	public void onTestSkipped(ITestResult result) {
	   System.out.println("Test Skipped...");
	  }
	public void onTestSuccess(ITestResult result) {
	    System.out.println("Test Succeess...");
	  }
	public void onFinish(ITestResult result) {					
        				
        		System.out.println("Test Finished...");
    }	
		
	

	

}
