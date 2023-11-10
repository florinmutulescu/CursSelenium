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
    public By blogLink= By.xpath("//li[@id='menu-item-76']/a[@class='sf-with-ul']");
    public By classicsLink = By.xpath("//li[@id='menu-item-114']"
			+ "/a[@href='https://keybooks.ro/category/classic/']");
    
    public By blogLink1 = By.linkText("BLOG");
    public By aboutLink=By.linkText("ABOUT");
    public By signUpButton = By.cssSelector("input[value='Sign up']");
    
    public By searchIcon = By.xpath("(//button[contains(@class, 'icon-search')])[1]");
	public By searchInput = By.cssSelector("input[class='search_field']");
	public By blogPostFormatsLink=By.xpath("//a[contains(text(),'Post Formats')][1]");
    
	public void navigateTo(By locator) {
		driver.findElement(locator).click();
	}


	
	

}
