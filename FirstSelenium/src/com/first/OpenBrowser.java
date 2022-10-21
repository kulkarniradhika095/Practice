package com.first;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenBrowser {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\java\\Drivers\\chromedriver_win32\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.testingshastra.com");
	String source = driver.getPageSource();
	System.out.println(source);
	String url = driver.getCurrentUrl();
	System.out.println(url);
	
	System.setProperty("webdriver.gecko.driver", "D:\\java\\Drivers\\geckodriver-v0.31.0-win64\\geckodriver.exe");
	FirefoxDriver driver1 = new FirefoxDriver();
	driver1.get("https://www.myntra.com");
	String url1 = driver1.getCurrentUrl();
	System.out.println(url1);
}
}
