package tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import utils.BaseTest;

public class Tema19Test extends BaseTest {
	
	@Test(priority =1)
	public void logareBlog() {

	app.menu.navigateTo(app.menu.blogLink);
	driver.findElement(app.menu.classicsLink).click();	
	}
	@Test(priority =2)
	public void verificareCategorie() throws InterruptedException {
		app.bcp.searchBlog();
		Thread.sleep(4000);
		app.bbcp.afisareElement(app.bbcp.imagine);
		assertTrue(app.bbcp.esteAfisatElementul(app.bbcp.classicNewRecommend));
	   
	}
	
	

}
