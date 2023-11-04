package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.SeleniumWrappers;

public class ShopCarte extends SeleniumWrappers {

	public ShopCarte(WebDriver driver) {
		super(driver);
	}
	public By cookingWithLoveLink = By.xpath("//a[@class='hover_icon hover_icon_link' and @href='https://keybooks.ro/shop/cooking-with-love/']");

}
