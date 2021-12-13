package com.VTiger.genericUtil;

import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersImplementation implements ITestListener
{

	public void onTestStart(ITestResult result) {
		
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getMethod().getMethodName()+" "+"test passed");
		
	}

	public void onTestFailure(ITestResult result) {
		System.out.println(result.getMethod().getMethodName()+" "+"test failed");
		try {
			BaseClass.takeScreenshot(result.getMethod().getMethodName());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void onTestSkipped(ITestResult result) {
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	public void onStart(ITestContext context) {
		
	}

	public void onFinish(ITestContext context) {
		
	}

	
	

}
