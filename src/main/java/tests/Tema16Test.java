package tests;

import static org.testng.Assert.assertTrue;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import pages.LogPagina;
import pages.LogarePagina;
import pages.MeniuPagTema16;
import pages.MeniuPagina;
import utils.BaseTest;

public class Tema16Test extends BaseTest{


	@Test(priority =1)
		public void validareJsAlert() throws InterruptedException {
		
		app.returnWebElement(app.menu1.contactLink).click();
		app.returnWebElement(app.login1.cookingBookLink ).click();;
		app.returnWebElement(app.login1.reviewLink).click();
		app.returnWebElement(app.login1.submitButton).click();
			
	    driver.switchTo().alert().accept();


	}
	@Test(priority =2)
	public void validareMesaj() {
		app.returnWebElement(app.login1.star).click();
        app.returnWebElement(app.login1.mesaj).sendKeys("maria1");
		app.returnWebElement(app.login1.nume).sendKeys("gabi");
		app.returnWebElement(app.login1.email).sendKeys("gabi@yahoo.com");
		app.returnWebElement(app.login1.save).click();
		app.returnWebElement(app.login1.submitButton).click();
		assertTrue(app.returnWebElement(app.login1.mesaj1).isDisplayed());


	}

}
