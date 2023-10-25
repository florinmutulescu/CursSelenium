package tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.LogPagina;
import pages.MeniuPagina;
import utils.BaseTest;

public class TemaTest extends BaseTest {
	@Test(priority =1)
	public void validareMesaj() throws InterruptedException {

		
		MeniuPagina menu =  new MeniuPagina(driver);
		menu.navigateTo(menu.contactLink);
	
		LogPagina login = new LogPagina(driver);
		login.sendMessage("florin", "florinmutulescu@yahoo.com","test","proba test");
		
		Thread.sleep(3000);
		assertTrue(login.verificareMesaj(login.sucesMesaj));


	}

}
