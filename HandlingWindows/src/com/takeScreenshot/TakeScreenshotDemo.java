package com.takeScreenshot;

import java.io.File;
import java.io.IOException;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;


public class TakeScreenshotDemo {
	
	public static void screenshotUsingSelenium() throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\java\\Drivers\\chromedriver_win32_103\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://testingshastra.com/");
		Thread.sleep(5000);
		//either
		//TakesScreenshot ts = (TakesScreenshot) driver;
		//File file = ts.getScreenshotAs(OutputType.FILE);
		//or
		
		File file = driver.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file ,new File("usingSelenium.jpg"));
		
		driver.close();
	}
	
	
	
	public static void main(String[] args) throws IOException, InterruptedException {
	screenshotUsingSelenium();
	}
}
