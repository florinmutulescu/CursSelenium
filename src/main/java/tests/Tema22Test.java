package tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utils.BaseTest;

public class Tema22Test extends BaseTest {
	
	
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
	public void verificareNumarBooksRomans() throws InterruptedException {
		List<WebElement> product =driver.findElements(By.cssSelector("li[class*='cat-item cat-item']"));
		System.out.println("Total product categories =  "+product.size());
		for (WebElement obj :product ) {
			String productCategories=obj.getText();
			System.out.println(productCategories);
			}
		product.get(9).click();
		Thread.sleep(4000);
		List<WebElement> romansBooks =driver.findElements(By.cssSelector("div>h2[class='woocommerce-loop-product__title']"));
		System.out.println("Total romans books (Romans) =  "+ romansBooks .size());
		assertTrue(romansBooks.size()==4);
		
			
			for (WebElement obj : romansBooks) {
				String titluRoman=obj.getText();
				System.out.println(titluRoman);
				}
			}
	
	@Test(priority=4)
	public void verificareBookRomansTest() throws InterruptedException {
	
	WebElement roman1 =app.returnWebElement(app.rp.book1Romans);
	String titluRoman1=roman1.getText();
	System.out.println(titluRoman1);
	assertEquals(roman1.getText(),"A banquet of mouse");
	WebElement roman2 =app.returnWebElement(app.rp.book2Romans);
	String titluRoman2=roman2.getText();
	System.out.println(titluRoman2);
	assertEquals(roman2.getText(),"Life in the garden");
	WebElement roman3 =app.returnWebElement(app.rp.book3Romans);
	String titluRoman3=roman3.getText();
	System.out.println(titluRoman3);
	assertEquals(roman3.getText(),"Lonely man in white hat");
	WebElement roman4 =app.returnWebElement(app.rp.book4Romans);
	String titluRoman4=roman4.getText();
	System.out.println(titluRoman4);
	assertEquals(roman4.getText(),"The son");
	
	
    }
	@Test(priority=5 )
    public void verificareBook1RomansTest() throws InterruptedException {
	app.rp.searchBookName(app.rp.book1Romans);
    WebElement romans =  driver.findElement
			(By.cssSelector("span>a[href*='product-category/romans/']"));
	String categorie=romans.getText();
    System.out.println(categorie);
    assertEquals(romans.getText(),"Romans");
	}
	@Test(priority=6)
	public class DataProviderRomansExample extends BaseTest{
		@DataProvider(name="bookNameLocatorDataProvider")
		public Object[][] bookNameLocatorDataProvider(){

			Object[][] data = new Object[4][2];

			data[0][0] = "A banquet of mouse";  
			data[0][1] = "product-category/romans/";          
//FAILED: tests.Tema22Test$DataProviderRomansExample.
//searchBooksTest("A banquet of mouse", "product-category/romans/")
//no such element: Unable to locate element: 
//{"method":"xpath","selector":"//a[text()='A banquet of mouse']"}			
//PASSED: tests.Tema22Test.verificareBook1RomansTest
//public By book1Romans=By.xpath("//a[text()='A banquet of  mouse']");			
			
			data[1][0] = "Life in the garden";
			data[1][1] = "product-category/romans/";

			data[2][0] = "Lonely man in white hat";
			data[2][1] = "product-category/romans/";

			data[3][0] = "The son";
			data[3][1] = "product-category/romans/";




			return data;
		}

		@Test(dataProvider = "bookNameLocatorDataProvider" )
		public void searchBooksTest(String nume, String categories ) throws InterruptedException {

			app.rp.searchBookName(By.xpath("//a[text()='"+nume+"']"));
			
			WebElement romans =  driver.findElement
					(By.cssSelector("span>a[href*='"+categories+"']"));
			assertEquals(romans.getText(),"Romans");
			driver.get("https://keybooks.ro/product-category/romans/");
		}
	}
	
}
	


