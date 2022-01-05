package WebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilites.SeleniumUtility;

public class Test_vtiger_contact extends SeleniumUtility{
	
	WebDriver driver;
	public Test_vtiger_contact(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@id='appnavigator']/div")
	WebElement AppNavigator;
	
	@FindBy(xpath="//div[@id='MARKETING_modules_dropdownMenu']/div/span[2]")
	WebElement Marketting;
	
	@FindBy(xpath="//div[@id='mCSB_1']/div/li[3]/a/span[2]")
	WebElement Contacts;
	
	
	
	public void Get_contact() {
		clickOnElement(AppNavigator);
		performMouseOverOperation(Marketting);
		clickOnElement(Contacts);
	}

}
