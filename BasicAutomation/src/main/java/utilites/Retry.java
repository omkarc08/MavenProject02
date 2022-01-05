package utilites;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer {

	int count =0 ;
	int RetryLimit = 2;
	
	public boolean retry(ITestResult result) {
		if(count < RetryLimit) {
			count ++;
			return true;
		}
		
		return false;
	}

}
