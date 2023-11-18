package utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class BaseTest {

	public WebDriver driver;
	public BasePage app;
	
	@BeforeClass(alwaysRun = true)
	public void setUp() {
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();//maximizes the browser
        driver.get("https://keybooks.ro");//navigates to the specified url
       
        app =  new BasePage(driver);
	}
	
	  @AfterClass(alwaysRun=true)
	public void tearDown() throws InterruptedException  {
		Thread.sleep(4000);// bad practice
		//driver.close();//inchide tabul curent
		driver.quit();//inchide browserul indiferent cate taburi sunt deschise
	}

}
