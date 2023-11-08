package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.SeleniumWrappers;

public class CookBooksPage extends SeleniumWrappers {

	public CookBooksPage(WebDriver driver) {
		super(driver);
		
	}
	public By priceBook1 = By.xpath("//a[@href='https://keybooks.ro"
			+ "/shop/a-hundred-and-one-receipes/']"
			+ "/following::bdi[contains(text(),'10.35')]");
	
	public By priceBook2 = By.xpath("//a[@href='https://keybooks.ro"
			+ "/shop/cooking-with-love/']"
			+ "/following::bdi[contains(text(),'18.49')]");
	
	public By priceBook4 = By.xpath("//a[@href='https://keybooks.ro"
			+ "/shop/healthy-lifestyle/']"
			+ "/following::bdi[contains(text(),'18.49')]");
	
	public By priceBook5 = By.xpath("//a[@href='https://keybooks.ro"
			+ "/shop/ultimate-book-of-receipes/']"
			+ "/following::bdi[contains(text(),'5.34')]");
	
	public String saleBook(By locator) {
		WebElement price =driver.findElement(locator);
		return price.getText();
	}

}
