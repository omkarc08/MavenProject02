package Basic_Operations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utilites.SeleniumUtility;

public class TestActiTime extends SeleniumUtility{
  @Test
  public void testlogin() {
	  TestSimpleLogin obj=new TestSimpleLogin();
		obj.setUp("chrome", "https://demo.actitime.com/login.do");
		System.out.println("Current page title is : "+driver.getTitle());
		System.out.println("Current page url is : "+driver.getCurrentUrl());
		//enter username: 1st Identify username field and dn perform required action(typing)
		WebElement userNameInputField=driver.findElement(By.id("username"));
		userNameInputField.sendKeys("admin");
		//enter password: 1st Identify password field and dn perform required action(typing)
		WebElement passwordInputField=driver.findElement(By.name("pwd"));
		passwordInputField.sendKeys("manager");
		//click on login button: 1st Identify login button and dn perform required action(typing)
		WebElement loginButton=driver.findElement(By.id("loginButton"));
		loginButton.click();
		
		driver.close();
		
  }
}
