package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import utils.SeleniumWrappers;

public class ShippingPage extends SeleniumWrappers{
	public ShippingPage(WebDriver driver) {
		super(driver);
	}

	public By shippingCountryDropDown =By.name("shipping_country");
	public By shippingStateDropDown =By.name("shipping_state");
	
	
	public void filterByIndex(int index) {	
		Select selectObj =  new Select(returnWebElement(shippingCountryDropDown));
		selectObj.selectByIndex(index);
	
	}
	public void filterByValue(String value) {
		Select selectObj =  new Select(returnWebElement(shippingStateDropDown));
		selectObj.selectByValue(value);
		
	}
	public String getCurrentSelectedOption() {
		Select selectObj =  new Select(returnWebElement(shippingCountryDropDown));
		return selectObj.getFirstSelectedOption().getText();
	}
	public String getCurrentSelectedOption1() {
		Select selectObj =  new Select(returnWebElement(shippingStateDropDown));
		return selectObj.getFirstSelectedOption().getText();
}
	}

