package Acadamy.E2EProject;

import java.io.IOException;

import org.testng.Assert;

import org.testng.annotations.Test;

import pageObjects.LandingPage;

import resources.base;

public class validateTitle extends base{

	
	@Test
	public void basePageNavigation() throws IOException {
		driver = initializeDriver();
		driver.get("http://www.qaclickacademy.com/");
		//Using inheritance concept
		//creating object to that class and invoke methods on it
		LandingPage l = new LandingPage(driver);
		String title = l.getTitle().getText();
		Assert.assertEquals(title, "FEATURED COURSES");
		
		
		
		
	}
	
}
