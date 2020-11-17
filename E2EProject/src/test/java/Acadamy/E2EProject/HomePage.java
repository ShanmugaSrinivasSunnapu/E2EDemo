package Acadamy.E2EProject;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

public class HomePage extends base{

	
	@Test(dataProvider="getData")
	public void basePageNavigation(String Username, String Password) throws IOException {
		driver = initializeDriver();
		driver.get("http://www.qaclickacademy.com/");
		//Using inheritance concept
		//creating object to that class and invoke methods on it
		LandingPage l = new LandingPage(driver);
		l.getLogin().click();//driver.findElement(By.xpath("   "))
		LoginPage lp=new LoginPage(driver);
		
		lp.getEmail().sendKeys(Username);
		lp.getPassword().sendKeys(Password);
		//System.out.println("Test");
		lp.clickLogIn().click();
		
		
		
		
		
		
	}
	@DataProvider
	public Object[][] getData() {
		//Row stands for how many different data types test should run
		//Columns stands for how many values per each test
		Object[][] data = new Object[2][2];
		
		data[0][0]="shanmugas888@gmail.com";
		data[0][1]="Honeyseenu@1";
		
		data[1][0]="sssrinivas451@gmail.com";
		data[1][1]="sunnapu@1290";
		return data;
		
		
		
		
		
		
		
		
		
	}
}
