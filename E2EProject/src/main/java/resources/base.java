package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class base {
	public WebDriver driver;
	public WebDriver initializeDriver() throws IOException {
		Properties prop = new Properties();
		FileInputStream it = new FileInputStream("C:\\Users\\shanm\\eclipse-workspace\\E2EProject\\src\\main\\java\\resources\\data.properties");
		prop.load(it);
		String browserName=prop.getProperty("browser");
		System.out.println(browserName);
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "c:/chromedriver.exe");
			driver = new ChromeDriver();
		}else if(browserName.equals("FF")){
			//System.setProperty("webdriver.gecko.driver", "c:/geckodriver.exe");
			//driver = new FirefoxDriver();
		}else if(browserName.equals("IE")) {
			//System.setProperty("webdriver.ie.driver", "c:/MicrosoftWebDriver.exe");
			//driver = new InternetExplorerDriver();
		}
	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		return driver;
		
		
		
	}
	
	
}
