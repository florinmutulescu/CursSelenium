package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.SeleniumWrappers;

public class ElementePaginaCarte extends SeleniumWrappers{

	public ElementePaginaCarte(WebDriver driver) {
		super(driver);
	
	}
	public By imagine = By.xpath("//img[@class='zoomImg']");
	public By titlu = By.xpath("//h1[contains(text(),'Cooking with love')]");
	public By pret = By.xpath("//bdi[contains(text(),'18.49')]");
	public By comentariu = By.xpath("//p[contains(text(),'This delightful book is the latest in the series, this is the story of how a tall, shy youth from Weston-super-Mare went on to become a self-confessed legend.')]");
	public By cantitate = By.xpath("//input[@min='1']");
	public By buton = By.xpath("//button[@name='add-to-cart']");
	public By categorie = By.xpath("//span[@class='posted_in']");
	
	public boolean esteAfisatElementul(By locator) {
		return driver.findElement(locator).isDisplayed();
	}
}
