package tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.BaseTest;

public class Tema19aTest  extends BaseTest  {
	
	@Test(priority =1)
	public void logareBooksCook() {

	app.menu.navigateTo(app.menu.shopLink);
	driver.findElement(app.shopCarte.cookBooksLink).click();	
	}

	@Test(priority = 2)
	public void verificarePret () {
		String text1 = app.cbp.saleBook(app.cbp.priceBook1);
		assertEquals(text1,"$10.35");
		
		String text2 = app.cbp.saleBook(app.cbp.priceBook2);
		assertEquals(text2,"$18.49");
		
		String text4 = app.cbp.saleBook(app.cbp.priceBook4);
		assertEquals(text4,"$18.49");
		
		String text5 = app.cbp.saleBook(app.cbp.priceBook5);
		assertEquals(text5,"$5.34");
		
	}

}
