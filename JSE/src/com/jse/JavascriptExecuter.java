package com.jse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecuter {
	
	public static void jseDemo() {
		System.setProperty("webdriver.chrome.driver", "D:\\java\\Drivers\\chromedriver_win32_104\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
	    driver.get("https://testingshastra.com/");
	    
	    driver.executeAsyncScript("window.scrollBy(0,100)");//String , vararg Object array
	    driver.close();
	}
	public static void parameterizedJseDemo() {
		System.setProperty("webdriver.chrome.driver", "D:\\java\\Drivers\\chromedriver_win32_104\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
	    driver.get("https://testingshastra.com/");
	    
	    driver.executeAsyncScript("window.scrollBy(arguments[0],arguments[1])",0,500);//String , vararg Object array
	    driver.close();
	}
	public static void valueReturnJse() {
		System.setProperty("webdriver.chrome.driver", "D:\\java\\Drivers\\chromedriver_win32_104\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
	    driver.get("https://www.goibibo.com/");
	    
	    String text = (String) driver.executeScript("return document.querySelector(\"div.header__contInners h2\").innerText");//String , vararg Object array
	    System.out.println(text);
	    driver.close();
	}
	
	public static void main(String[] args) {
		jseDemo();
		parameterizedJseDemo();
		valueReturnJse();
	}
}
