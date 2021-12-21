package Basic_Operations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utilites.SeleniumUtility;


public class TestSimpleLogin extends SeleniumUtility{
	static WebDriver driver;

	@Test
	public void testActitimeLogin() {
        		
		TestSimpleLogin obj=new TestSimpleLogin();
		obj.setUp("chrome", "http://www.google.com/");
       				
    }

}
