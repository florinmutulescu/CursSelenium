package tests;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import utils.BaseTest;

public class Tema18bTest extends BaseTest {
	@Test(priority =1)
	public void logareFacebook() {
	System.out.println("Current window before :" + driver.getWindowHandle());
	app.menu.navigateTo(app.menu.facebookLink);
	System.out.println("All windows : " + driver.getWindowHandles());

	List<String> browserTabs = new ArrayList<>(driver.getWindowHandles());
	driver.switchTo().window(browserTabs.get(1));
	
	app.returnWebElement(app.login.facebookCookies).click();
	//System.out.println(app.returnWebElement(app.login.facebookLog).isEnabled());
	assertEquals(driver.getCurrentUrl(), "https://www.facebook.com/keytraining.ro");
	
	driver.switchTo().window(browserTabs.get(0));
}
	@Test(priority =2)
	public void logareTwitter() {
	System.out.println("Current window before :" + driver.getWindowHandle());
	app.menu.navigateTo(app.menu.twitterLink);
	System.out.println("All windows : " + driver.getWindowHandles());
	List<String> browserTabs1 = new ArrayList<>(driver.getWindowHandles());
	driver.switchTo().window(browserTabs1.get(2));
	
	assertEquals(driver.getCurrentUrl(), "https://twitter.com/");
	driver.switchTo().window(browserTabs1.get(0));
	}
	@Test(priority =3)
	public void logareInstagram() {
	System.out.println("Current window before :" + driver.getWindowHandle());
	app.menu.navigateTo(app.menu.instagramLink);
	System.out.println("All windows : " + driver.getWindowHandles());
	List<String> browserTabs2 = new ArrayList<>(driver.getWindowHandles());
	driver.switchTo().window(browserTabs2.get(3));
	
	assertEquals(driver.getCurrentUrl(), "https://www.instagram.com/");
	}
	
	
	}
