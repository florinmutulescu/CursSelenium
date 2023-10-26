package tests;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.BaseTest;

public class ImplicitWaitExample extends BaseTest {
	
	@Test
	public void implicitWait() {

		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.cssSelector("div[id='start']>button")).click();

		WebElement finish =  driver.findElement(By.id("finish"));
		assertEquals(finish.getText(), "Hello World!");

	}

}
