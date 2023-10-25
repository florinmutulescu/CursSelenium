package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogPagina {

	public WebDriver driver;

	public LogPagina(WebDriver driver) {
		this.driver = driver;
	}
	
		public By nume = By.cssSelector("input[type='text'][name='your-name']");
          public By email = By.cssSelector("input[type='email'][name='your-email']");
		public By subiect = By.cssSelector("input[type='text'][name='your-s']");
		public By mesaj = By.cssSelector("textarea[name='your-message']");
		public By butonMesaj = By.cssSelector("input[type='submit'][value='Send Message']");
		public By sucesMesaj = By.cssSelector("div[class='wpcf7-response-output']");
		
		
		public void sendMessage(String name, String emailUser,String subject,String message) {
			driver.findElement(nume).sendKeys(name);
			driver.findElement(email).sendKeys(emailUser);
			driver.findElement(subiect).sendKeys(subject);
			driver.findElement(mesaj).sendKeys(message);
			driver.findElement(butonMesaj).click();
		}

		public boolean verificareMesaj(By locator) {
			return driver.findElement(locator).isDisplayed();
		}

	
	
	
}

