package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.SeleniumWrappers;

public class BlogPostFormatsPage extends SeleniumWrappers {

	public BlogPostFormatsPage(WebDriver driver) {
		super(driver);
		}
	public By audioPost=By.xpath("//a[contains(text(),'Audio post')]");
	public By audioPostPlay = By.xpath("//div[@class='mejs-button mejs"
			+ "-playpause-button mejs-play']");
	
	public By sliderAudioInitialPosition = By.cssSelector("div[class="
			+ "'mejs-horizontal-volume-current']");
	
	public By sliderPlayInitialPosition = By.cssSelector("span[class="
			+ "'mejs-time-total mejs-time-slider']");
}
