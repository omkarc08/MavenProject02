package utilites;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumUtility {
	public static WebDriver driver;
	protected static Properties properties;
	protected static Actions action;
	protected static FileInputStream fis;
	protected static String filePath;
	/**
	 * using this method we can load our property and also open desired browser
	 */
	{
		filePath = System.getProperty("user.dir") + "\\src\\main\\resources\\testData\\testAppData.properties";
		System.out.println("*******************Filepath: " + filePath);
	}

	public static WebDriver setUp(String browserName, String appUrl) {
		System.out.println("*******************Filepath: " + filePath);
		properties = new Properties();
		try {
			System.out.println("*******************Filepath2: " + filePath);
			fis = new FileInputStream(filePath);
			properties.load(fis);
			System.out.println("*******************Filepath3: " + filePath);
		} catch (Exception e) {

		}
		if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("ie")) {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(appUrl);
		action = new Actions(driver);
		return driver;
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public static void typeInput(WebElement element, String input) {
		element.clear();
		element.sendKeys(input);
	}

	public static void clickOnElement(WebElement element) {
		element.click();
	}

	public static void performMouseOverOperation(WebElement element) {
		action.moveToElement(element).perform();
	}

	public void performRightClickOperation(WebElement element) {
		action.moveToElement(element).contextClick().build().perform();
	}

	public void performDragAndDrop(WebElement source, WebElement target) {
		action.dragAndDrop(source, target).build().perform();
	}

	public void takeScreenShotOfThePage(String location) {
		// downcast the driver to access TakesScreenshot method
		TakesScreenshot ts = (TakesScreenshot) driver;
		// capture screenshot as output type FILE
		File file = ts.getScreenshotAs(OutputType.FILE);
		try {
			// save the screenshot taken in destination path
			FileUtils.copyFile(file, new File(location));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void FailedTestScreenshots(String testMethodName) {
		// downcast the driver to access TakesScreenshot method
		TakesScreenshot ts = (TakesScreenshot) driver;
		// capture screenshot as output type FILE
		File file = ts.getScreenshotAs(OutputType.FILE);
		try {
			// save the screenshot taken in destination path
			FileUtils.copyFile(file,
					new File("C:\\setup\\workspace\\BasicAutomation\\Screenshots\\" + testMethodName + ".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}}

	/**
	 * Method to get the title of current page
	 */
	public String getCurrentTitleOfApplication() {
		return driver.getTitle();
	}

	/**
	 * Method to get the current url of the application
	 */
	public String getCurrentUrlOfApplication() {
		return driver.getCurrentUrl();
	}

	public boolean isElementExist(WebElement element) {
		return element.isDisplayed();
	}

	public boolean isCheckBoxSelected(WebElement element) {
		return element.isSelected();
	}

	/**
	 * Utility to handle HTML dropdown list
	 */
	protected static void handleHtmlDropdownListWithVisibleText(WebElement element, String visibileText) {

		Select select = new Select(element);
		select.selectByVisibleText(visibileText);
	}

	/**
	 * Utility to handle HTML dropdown list
	 */
	protected  static void handleHtmlDropdownListWithIndex(WebElement element, int index) {

		Select select = new Select(element);
		select.selectByIndex(index);
	}

	/**
	 * Utility to handle HTML dropdown list
	 */
	protected List<WebElement> getHtmlDropdownListSize(WebElement element) {

		Select select = new Select(element);
		return select.getOptions();
	}

	/**
	 * Utility to handle HTML dropdown list
	 */
	protected WebElement getFirstSelectedOptionFromHtmlDropdownList(WebElement element) {

		Select select = new Select(element);
		return select.getFirstSelectedOption();
	}

	/**
	 * Utility to handle HTML dropdown list
	 */
	protected List<WebElement> getAllSelectedOptionFromMultiSelectDropdownList(WebElement element) {

		Select select = new Select(element);
		return select.getAllSelectedOptions();
	}

	/**
	 * Utility to handle iframes
	 */
	protected void switchToIFrameWithWebElement(WebElement element) {

		driver.switchTo().frame(element);
	}

	/**
	 * Utility to handle iframes
	 */
	protected void switchToIFrameWithIndex(int index) {

		driver.switchTo().frame(index);
	}

	/**
	 * Utility to handle iframes
	 */
	protected void switchFromIFrameToMainPage() {

		driver.switchTo().defaultContent();
	}

	/**
	 * This is sleep method from java only use it when uttermost required
	 * 
	 * @param millis time in mili seconds
	 */
	protected void setSleepTime(long millis) {

		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {

		}
	}

	/**
	 * Method to refresh Page
	 */
	protected void refreshPage() {

		driver.navigate().refresh();

	}

	/**
	 * Method to wait for an element till it's not display .
	 * 
	 * @param by
	 */
	public void waitForElementDisplayed(WebElement element) {

		new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOf(element));
	}

	/**
	 * Method to wait for an element till it's not clickable.
	 * 
	 * @param by
	 */
	public void waitForElementToBeClickable(WebElement element) {

		new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(element));
	}

	public static void cleapUp() {
		driver.close();
	}

}