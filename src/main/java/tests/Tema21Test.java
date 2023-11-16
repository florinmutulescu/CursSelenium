package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import utils.BaseTest;

public class Tema21Test extends BaseTest{
	
	
	@Test(priority =1)
	public void logareBlogPostFormats() {
		
		//app.menu.navigateTo(app.menu.blogLink);
		//app.menu.navigateTo(app.menu.blogPostFormatsLink);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		app.hoverElement(app.menu.blogLink);
		jse.executeScript("document.getElementById('menu-item-232')"+
		".childNodes[0].click()");
	}
	@Test(priority=2)
	public void scrollToGalleryFormat() throws InterruptedException {
		//JS scroll
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView()",
				app.returnWebElement(app.bpfp.galleryFormat));
		Thread.sleep(4000);
		//jse.executeScript("window.scrollBy(0, -100)");
}
	@Test(priority =3)
	public void logareGalleryFormat() {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("document.getElementsByClassName('post_title')[4]"
				+ ".childNodes[0].click()");
	}
	@Test(priority=4)
	public void lansareMesajAddComment() {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
	
			jse.executeScript("document.getElementsByClassName('comments_field comments_message')[0]"
					+ ".childNodes[1].click()");
			jse.executeScript("document.getElementsByClassName('comments_field comments_message')[0]"
					+ ".childNodes[1].value='stefan' ");
			
			jse.executeScript("document.getElementById('author').click()");
			jse.executeScript("document.getElementById('author').value='florin'");
			
			jse.executeScript("document.getElementById('email').click()");
			jse.executeScript("document.getElementById('email').value='florinmutulescu@yahoo.com'");
			
			jse.executeScript("document.getElementById('url').click()");
			jse.executeScript("document.getElementById('url').value='dorin'");
			
			jse.executeScript("document.getElementById('send_comment').click()");
			
			
}
}	