package tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.BaseTest;

public class Tema19aTest  extends BaseTest  {
	
	@Test(priority =1)
	public void logareBooks() {
	app.menu.navigateTo(app.menu.shopLink);	
	}

	@Test(priority=2)
	public void filtrareElementProductCategoriesBook() {
		List<WebElement> books =driver.findElements(By.xpath("//a[@href='https:"
				+ "//keybooks.ro/product-category/cookbooks/']"));
		System.out.println("Cookooks (product-category) =  "+books.size());
		books.get(0).click();	
	}
	@Test(priority=3)
	public void totalCookingBooks() {
		List<WebElement> cookingBooks =driver.findElements(By.cssSelector("div>a[class*='hover_icon']"));
		System.out.println("Total cooking books (Cookbooks) =  "+cookingBooks.size());
		
	}
	
	@Test(priority=4)
	public void totalSaleCookingBook() {
		
		List<WebElement> cookingSaleBooks =driver.findElements(By.cssSelector("a[class*='hover_icon']>span"));
		System.out.println("Total cooking sale books (Cookbooks) =  "+cookingSaleBooks.size());
		
	}
	
	@Test(priority=5)
	public void checkSaleFromTotalCookingBook() {
		List<WebElement> cookingBooks =driver.findElements(By.cssSelector("div>a[class*='hover_icon']"));
		List<WebElement> cookingSaleBooks =driver.findElements(By.cssSelector("a[class*='hover_icon']>span"));
		System.out.print("Total cooking books (Cookbooks) = Total cooking sale books (Cookbooks)--->");
		System.out.println(cookingSaleBooks.size()==cookingBooks.size());
	}
	
	
	//@Test(priority =6 )
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
