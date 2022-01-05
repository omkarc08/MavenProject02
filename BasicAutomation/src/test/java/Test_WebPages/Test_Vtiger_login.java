package Test_WebPages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import WebPages.Test_Login_Page_Vtiger;
import WebPages.Test_vtiger_contact;

public class Test_Vtiger_login {
	WebDriver driver;
	@Test
	public void test_login() {
//	WebDriverManager.chromedriver().setup();	
//	WebDriver driver=new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//	driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		
		
	Test_Login_Page_Vtiger test= new Test_Login_Page_Vtiger(driver);
	Test_Login_Page_Vtiger.setUp("chrome", "https://demo.vtiger.com/vtigercrm/index.php");
	test.login("admin", "Test@123");
	
	Test_vtiger_contact t2=new Test_vtiger_contact(driver);
	t2.Get_contact();

}
}