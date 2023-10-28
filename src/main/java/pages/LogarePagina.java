package pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogarePagina {
	public WebDriver driver;

	public LogarePagina(WebDriver driver) {
		this.driver = driver;
		
	}
	
	public By cookingBookLink = By.cssSelector("a[class='hover_icon hover_icon_link'][href='https://keybooks.ro/shop/cooking-with-love/']");
	public By reviewLink = By.cssSelector("li>a[href='#tab-reviews']");
	public By submitButton = By.cssSelector("p>input[id='submit']");
	
	
	public By star = By.cssSelector("a[class='star-4'][href='#']");
	public By mesaj = By.cssSelector("textarea[id='comment']");
	public By nume = By.cssSelector("input[id='author'][type='text']");
    public By email = By.cssSelector("input[id='email'][name='email']");
    public By save = By.cssSelector("input[id='wp-comment-cookies-consent'][type='checkbox']");
    public By mesaj1 = By.cssSelector("p>em[class='woocommerce-review__awaiting-approval']");
    
    
   
}
    
	