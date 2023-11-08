package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.SeleniumWrappers;

public class BlogClassicsPage extends SeleniumWrappers  {

	public BlogClassicsPage(WebDriver driver) {
		super(driver);
		
	}
	public By search = By.xpath("//form[@class='search_form']"
			+ "/input[@class='search_field' and @title='Search for:']");
	public By buttonSearch =By.xpath("//button[@class='search_button icon-search']");
	
	public void searchBlog() {
		driver.findElement(search).sendKeys("Why I won't stop buying books");
		driver.findElement(buttonSearch).click();
	}
	

}
