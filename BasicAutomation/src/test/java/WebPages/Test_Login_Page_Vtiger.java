package WebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilites.SeleniumUtility;

public class Test_Login_Page_Vtiger extends SeleniumUtility{
	
	WebDriver driver;
	public Test_Login_Page_Vtiger(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	//WebElement username=driver.findElement(By.id());
	@FindBy(id="username")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(xpath="//button[text()='Sign in']")
	WebElement loginButton;
	
	
	public void login(String un,String pwd) {
		
//		username.clear();
//		password.clear();
//		username.sendKeys(un);
//		password.sendKeys(pwd);
//		loginButton.click();
		typeInput(username,un);
		typeInput(password,pwd);
		clickOnElement(loginButton);
	}
	

}
