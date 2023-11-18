package pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import utils.SeleniumWrappers;

public class RomansPage extends SeleniumWrappers{

	public RomansPage(WebDriver driver) {
		super(driver);
		
	}
	public By book1Romans=By.xpath("//a[text()='A banquet of  mouse']");
	public By book2Romans=By.xpath("//a[text()='Life in the garden']");
	public By book3Romans=By.xpath("//a[text()='Lonely man in white hat']");
	public By book4Romans=By.xpath("//a[text()='The son']");
	
	public By book1Romans1=By.cssSelector("h2>a[href*='a-banquet-of-mouse/']");
	public By book2Romans2=By.cssSelector("h2>a[href*='life-in-the-garden/']");
	public By book3Romans3=By.cssSelector("h2>a[href*='lonely-man-in-white-hat/']");
	public By book4Romans4=By.cssSelector("h2>a[href*='the-son/']");
	
	public void searchBookName(By locator) {
	 driver.findElement(locator).click(); 
		
	}
	

}
