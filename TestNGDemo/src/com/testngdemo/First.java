package com.testngdemo;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//import io.github.bonigarcia.wdm.WebDriverManager;


public class First {
	ChromeDriver driver; //global declaration
	@BeforeMethod
	public void setUp() {
		/*WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();*/
		System.setProperty("webdriver.chrome.driver", "D:\\java\\Drivers\\chromedriver_win32_103\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	@Test
	public void m1() throws InterruptedException {
		
		
		driver.get("https://ijmeet.com/register?csrt=2207161033905554373");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn btn-block btn-primary btn-lg font-weight-medium auth-form-btn mirror-view-btn-primary']")).click();
		String errorMsg = driver.findElement(By.xpath("//label[@id='name-error-server']")).getText();
		if (!errorMsg.isEmpty()) {
			System.out.println("PASS");
		} else {
			throw new ArrayIndexOutOfBoundsException();
		}
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
	
	@Test
	public void m2() {
		
	}
}
