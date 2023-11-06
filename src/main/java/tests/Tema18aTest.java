package tests;
import org.openqa.selenium.By;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import utils.BaseTest;

public class Tema18aTest extends BaseTest{
	
	@Test(priority =1)
	public void logareShopBooks() {

	app.menu.navigateTo(app.menu.shopLink);
	driver.findElement(app.shopCarte.cookingWithLoveLink).click();	
	}
	@Test(priority =2)
	public void verificareAfisareElementeCarte() {
		assertTrue(app.epc.esteAfisatElementul(app.epc.imagine));
		assertTrue(app.epc.esteAfisatElementul(app.epc.titlu));
	    assertTrue(app.epc.esteAfisatElementul(app.epc.pret));
		assertTrue(app.epc.esteAfisatElementul(app.epc.comentariu));
		assertTrue(app.epc.esteAfisatElementul(app.epc.cantitate));
		assertTrue(app.epc.esteAfisatElementul(app.epc.buton));
		assertTrue(app.epc.esteAfisatElementul(app.epc.categorie));
	}
		
	}

