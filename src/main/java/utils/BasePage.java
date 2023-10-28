package utils;

import org.openqa.selenium.WebDriver;

import pages.LogarePagina;
import pages.LoginPage;
import pages.MeniuPagTema16;
import pages.MenuPage;

public class BasePage extends SeleniumWrappers{

	public BasePage(WebDriver driver) {
		super(driver);
	}

	public LoginPage login =  new LoginPage(driver);
	public MenuPage menu = new MenuPage(driver);
    public LogarePagina login1 = new LogarePagina(driver);
    public MeniuPagTema16 menu1 = new MeniuPagTema16(driver);

}