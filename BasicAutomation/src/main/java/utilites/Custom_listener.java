package utilites;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Custom_listener extends SeleniumUtility implements ITestListener {
	@Override
	public void onStart(ITestContext Result) {
		System.out.println("TestCase Successfully Started");

	}

	public void onFinish(ITestContext Result) {
		System.out.println("All TestCases Finished");
	}
	

	public void onTestStart(ITestResult Result) {
		System.out.println("TestCase Started : "+ Result.getName());
		FailedTestScreenshots(Result.getMethod().getMethodName());
		
	}
	
	public void onTestFailure(ITestResult Result) {
		System.out.println("TestCase Failed : "+ Result.getName());
	}


	public void onTestSkipped(ITestResult Result) {
		System.out.println("TestCase Skipped : " + Result.getName());

	}

	
	public void onTestSuccess(ITestResult Result) {
		System.out.println("TestCase Successed : " +  Result.getName());

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	
	}

