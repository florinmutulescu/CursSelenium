package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.SeleniumWrappers;

public class BlogBlogClassicsPage extends SeleniumWrappers{

	public BlogBlogClassicsPage(WebDriver driver) {
		super(driver);
	}
	public By imagine = By.xpath("//a[@class='hover_icon hover_icon_link']");
	public By classicNewRecommend = By.xpath("//div[@class='post_info']"
			+ "/following::span[@class='post_info_item post_info_tags']");
	public void afisareElement(By locator) {
		driver.findElement(locator).click();
	}
	public boolean esteAfisatElementul(By locator) {
		return driver.findElement(locator).isDisplayed();
	}
}
