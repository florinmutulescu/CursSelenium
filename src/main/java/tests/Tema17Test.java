package tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.MenuPage;
import utils.BaseTest;

public class Tema17Test extends BaseTest{
	
	@Test(priority =1)
	public void logareAplicatie() {

	
		//MenuPage menu =  new MenuPage(driver);
		app.menu.navigateTo(app.menu.loginLink);
	
		//LoginPage login = new LoginPage(driver);
		app.login.loginInApp("TestUser", "12345@67890");
	
	
		assertTrue(app.login.checkLoginMsgIsDisplayed(app.login.sucessLoginMsg));
	

	}
	@Test(priority=2)
	public void selectByIndexTest() {
		app.shipping.filterByIndex(41);
		assertEquals(app.shipping.getCurrentSelectedOption(), "Canada");
	}
	
	@Test(priority = 3)
	public void selectByValueTest() {
		app.shipping.filterByValue("NL");
		assertEquals(app.shipping.getCurrentSelectedOption1(), "Newfoundland and Labrador");
	}
	
	


}
