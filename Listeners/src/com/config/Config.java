package com.config;



import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



@Test
public class Config {
public static RemoteWebDriver driver = null;
	
	
	@Parameters("browser-name")
	@BeforeMethod
	public void setUp(@Optional String browserName)  {
		//Open specified browser
		if (browserName == null) {
			browserName = "Chrome";
		}
		if (browserName.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver =  new ChromeDriver();
			driver.get("https://www.goibibo.com/");
			/*System.setProperty("webdriver.chrome.driver", "D:\\java\\Drivers\\chromedriver_win32_104\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.goibibo.com/");
			driver.close();*/
		} else if (browserName.equalsIgnoreCase("Firefox")){
			WebDriverManager.firefoxdriver().setup();
			driver =  new FirefoxDriver();
			/*System.setProperty("webdriver.gecko.driver", "D:\\java\\Drivers\\geckodriver-v0.31.0-win64\\geckodriver.exe");
			FirefoxDriver driver1 = new FirefoxDriver();
			driver1.get("https://www.youtube.com/");
			driver1.close();*/
			driver.get("https://www.youtube.com/");
		} else if (browserName.equalsIgnoreCase("Edge")) {
			/*System.setProperty("webdriver.edge.driver", "D:\\java\\Drivers\\edgedriver_win64\\msedgedriver.exe");
			EdgeDriver driver2 = new EdgeDriver();
			driver2.get("https://www.youtube.com/");
			driver2.close();*/
			WebDriverManager.edgedriver().setup();
			driver =  new EdgeDriver();
			driver.get("https://www.youtube.com/");
		}
		
		
		
	}
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
}
