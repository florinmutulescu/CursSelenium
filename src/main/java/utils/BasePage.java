package utils;

import org.openqa.selenium.WebDriver;

import pages.BlogBlogClassicsPage;
import pages.BlogClassicsPage;
import pages.ContactsPage;
import pages.CookBooksPage;
import pages.ElementePaginaCarte;
import pages.EventsPage;
import pages.GenericEventPage;
import pages.LogarePagina;
import pages.LoginPage;
import pages.MeniuPagTema16;
import pages.MenuPage;
import pages.ShippingPage;
import pages.ShopCarte;
import pages.ShopPage;

public class BasePage extends SeleniumWrappers{

	public BasePage(WebDriver driver) {
		super(driver);
	}

	public LoginPage login =  new LoginPage(driver);
	public MenuPage menu = new MenuPage(driver);
    public LogarePagina login1 = new LogarePagina(driver);
    public MeniuPagTema16 menu1 = new MeniuPagTema16(driver);
    public ShopPage shop =  new ShopPage(driver);
    public ContactsPage contacts = new ContactsPage(driver);
    public ShippingPage shipping = new ShippingPage(driver);
    public EventsPage events =  new EventsPage(driver);
	public GenericEventPage genericEvent =  new GenericEventPage(driver);
	public ElementePaginaCarte epc=  new ElementePaginaCarte(driver);
	public ShopCarte shopCarte = new ShopCarte(driver);
	public BlogClassicsPage bcp=new BlogClassicsPage(driver);
	public BlogBlogClassicsPage bbcp=new BlogBlogClassicsPage(driver);
	public CookBooksPage cbp = new CookBooksPage(driver);
	
	
	
	
}