package Listner;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import junit.framework.Assert;
import utilites.SeleniumUtility;

@Listeners(utilites.Custom_listener.class)
public class Test_listner01 extends SeleniumUtility {

	@BeforeTest
	public void login() {
		driver = setUp("chrome", "https://www.google.com/");
	}

	@Test
	public void A() {
		Assert.assertEquals("Google", "Google");
	}

	@Test
	public void B() {
		Assert.assertEquals(true, true);
	}

	@Test
	public void C() {
		Assert.assertEquals(true, false);
	}
}
