package VtigerAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import utilites.SeleniumUtility;

public class Test_vtiger extends SeleniumUtility {
	static WebDriver driver;
	@Test
  	public void TestVtigerLogin() throws InterruptedException {
  		driver = setUp("chrome", "https://demo.vtiger.com/vtigercrm/index.php");
  		
  		typeInput(driver.findElement(By.xpath("//input[@id=\"username\"]")), "admin");
  		
  		typeInput(driver.findElement(By.xpath("//input[@id=\"password\"]")), "Test@123");

  		clickOnElement(driver.findElement(By.xpath("//button[text()='Sign in']")));
  		
  		clickOnElement(driver.findElement(By.xpath("//div[@id='appnavigator']/div")));
  		
  		performMouseOverOperation(driver.findElement(By.xpath("//div[@id='MARKETING_modules_dropdownMenu']/div/span[2]")));
  		
  		clickOnElement(driver.findElement(By.xpath("//div[@id='mCSB_1']/div/li[3]/a/span[2]")));
  		
  		clickOnElement(driver.findElement(By.xpath("//div[@id='appnavcontent']/ul/li[1]/button")));
  		
  		handleHtmlDropdownListWithVisibleText(driver.findElement(By.xpath("//select[@class='inputElement select2 select2-offscreen' and @name='salutationtype']")), "Mr.");
  		
  		typeInput(driver.findElement(By.xpath("//input[@name='firstname']")), "Sachin");
  		
  		typeInput(driver.findElement(By.xpath("//input[@id='Contacts_editView_fieldName_lastname']")),"Annadate");
  		
  		typeInput(driver.findElement(By.xpath("//input[@id=\"Contacts_editView_fieldName_phone\"]")), "8624874129");
  		
  		typeInput(driver.findElement(By.xpath("//input[@class=\"inputElement \" and @id=\"Contacts_editView_fieldName_title\"]")), "Acceleration");
  		
  		clickOnElement(driver.findElement(By.xpath("//button[text()='Save']")));
  		
  		clickOnElement(driver.findElement(By.xpath("//h4[@class='module-title pull-left text-uppercase']")));
  		Thread.sleep(2000);
  		
  		clickOnElement(driver.findElement(By.xpath("//i[@class=\"fa fa-ellipsis-v icon\"]")));
 		Thread.sleep(2000);
  		clickOnElement(driver.findElement(By.xpath("//ul[3]/li/a[@name=\"editlink\"]")));
 		Thread.sleep(2000);
  		driver.navigate().back();
  		
  		clickOnElement(driver.findElement(By.xpath("//input[@class=\"listViewEntriesCheckBox\"]")));
 		Thread.sleep(2000);
  		clickOnElement(driver.findElement(By.xpath("//button[@id=\"Contacts_listView_massAction_LBL_DELETE\"]")));
 		Thread.sleep(2000);
  		clickOnElement(driver.findElement(By.xpath("//button[text()='Yes']")));
 		Thread.sleep(2000);
  		cleapUp();
  }
}
