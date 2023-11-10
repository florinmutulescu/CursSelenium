package tests;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import utils.BaseTest;

public class Tema20Test extends BaseTest  {
	
	@Test(priority =1)
	public void logareBlogPostFormats() {

	app.menu.navigateTo(app.menu.blogLink);
	app.menu.navigateTo(app.menu.blogPostFormatsLink);
	}
	
	@Test(priority =2)
	public void mutareSlidereAudioPost() {
		app.click(app.bpfp.audioPost);
		app.click(app.bpfp.audioPostPlay);
		
		app.dragAndDrop(app.bpfp.sliderPlayInitialPosition, 160, 0);
		app.dragAndDrop(app.bpfp.sliderAudioInitialPosition, 50, 0);
		
		
		
	}


		
	   
	}


