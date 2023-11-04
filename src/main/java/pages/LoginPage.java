package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	public WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	

	//locatori sau webelemente
	public By usernameField = By.id("log");
	public By passwordField = By.id("password");
	public By submitButton = By.className("submit_button");
	public By sucessLoginMsg = By.cssSelector("div[class*='sc_infobox_style_success']");
    public By rememberMeCheckBox = By.cssSelector("li input[type='checkbox']");
    //public By facebookLog= By.xpath("//div[@class='x1egiwwb x4l50q0']");
    public By facebookCookies =By.xpath("//div[@class='x1n2onr6 x1ja2u2z x78zum5 x2lah0s xl56j7k x6s0dn4 xozqiw3 x1q0g3np xi112ho x17zwfj4 x585lrc x1403ito x972fbf xcfux6l x1qhh985 xm0m39n x9f619 xn6708d x1ye3gou xtvsq51 x1r1pt67']");
   


	//metode specifice paginii sau functionalitatii pe care o reprezinta
	public void loginInApp(String user, String pass) {
		driver.findElement(usernameField).sendKeys(user);
		driver.findElement(passwordField).sendKeys(pass);
		driver.findElement(submitButton).click();
	}

	public boolean checkLoginMsgIsDisplayed(By locator) {
		return driver.findElement(locator).isDisplayed();
	}

}
