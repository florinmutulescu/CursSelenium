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
		app.epc.esteAfisatElementul(app.epc.imagine);
		app.epc.esteAfisatElementul(app.epc.titlu);
		app.epc.esteAfisatElementul(app.epc.pret);
		app.epc.esteAfisatElementul(app.epc.comentariu);
		app.epc.esteAfisatElementul(app.epc.cantitate);
		app.epc.esteAfisatElementul(app.epc.buton);
		app.epc.esteAfisatElementul(app.epc.categorie);
	}
		
	}

