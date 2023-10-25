package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MeniuPagina {
	public WebDriver driver;

	public MeniuPagina(WebDriver driver) {
		this.driver = driver;
	}


	public By contactLink = By.cssSelector("a[href='https://keybooks.ro/contacts/']"); 
	


	public void navigateTo(By locator) {
		driver.findElement(locator).click();
	}

}
