package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MenuPage {
	
	public WebDriver driver;

	public MenuPage(WebDriver driver) {
		this.driver = driver;
	}


	public By loginLink = By.cssSelector("li>a[href='#popup_login']");
	public By contactsLink =  By.linkText("CONTACTS");
	public By shopLink = By.linkText("BOOKS");
	public By eventsLink = By.linkText("EVENTS");
    public By facebookLink = By.xpath("//a[@class='social_icons social_facebook']/span[1]");
    public By twitterLink= By.xpath("//a[@href='https://twitter.com/']/span[1]");
    public By instagramLink= By.xpath("//a[@href='https://www.instagram.com']/span[1]");
     
	public void navigateTo(By locator) {
		driver.findElement(locator).click();
	}


	
	

}
