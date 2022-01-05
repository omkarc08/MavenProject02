package Listner;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_RetryTest {

	@Test(retryAnalyzer=utilites.Retry.class)
//	@Test
	public void Test_Login() {
		  Assert.assertEquals(true, false);
	  }
	  
//	  @Test
	  @Test(retryAnalyzer=utilites.Retry.class)
	  public void Test_Browser() {
		  Assert.assertEquals(true, false);
	  }
}
