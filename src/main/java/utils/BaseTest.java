package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class BaseTest {

	public WebDriver driver;
	
	@BeforeClass
	public void setUp() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();//maximizes the browser
        driver.get("https://keybooks.ro");//navigates to the specified url
	}
	
	@AfterClass
	public void tearDown() throws InterruptedException  {
		Thread.sleep(4000);// bad practice
		//driver.close();//inchide tabul curent
		driver.quit();//inchide browserul indiferent cate taburi sunt deschise
	}

}
