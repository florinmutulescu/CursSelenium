package tests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utils.BaseTest;

public class Tema22aTest extends BaseTest {
	@Test(priority =1)
	public void logareBooks() {
	app.menu.navigateTo(app.menu.shopLink);
	
	}
	@Test(priority=2)
	public void verificareRedirectRomans() {
		app.click(app.shop.romans);
		assertEquals(driver.getCurrentUrl(), "https://keybooks.ro/product-category/romans/");
	}
	@Test(priority=3)
	public class DataProviderRomans extends BaseTest{
		@DataProvider(name="bookNameLocator")
		public Object[][] bookNameLocator(){

			Object[][] data = new Object[4][2];

			data[0][0] = "a-banquet-of-mouse/";  
			data[0][1] = "product-category/romans/";          
		
			
			data[1][0] = "life-in-the-garden/";
			data[1][1] = "product-category/romans/";

			data[2][0] = "lonely-man-in-white-hat/";
			data[2][1] = "product-category/romans/";

			data[3][0] = "the-son/";
			data[3][1] = "product-category/romans/";




			return data;
		}

		@Test(dataProvider = "bookNameLocator" )
		public void searchBooksTest(String nume1, String categories1 ) throws InterruptedException {
			driver.get("https://keybooks.ro/product-category/romans/");
			app.rp.searchBookName(By.cssSelector("h2>a[href*='"+nume1+"']"));
			
			WebElement romans =  driver.findElement
					(By.cssSelector("span>a[href*='"+categories1+"']"));
			assertEquals(romans.getText(),"Romans");
			
		}
	}
	
}
