package com.first;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser2 {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\java\\Drivers\\chromedriver_win32_104\\chromedriver.exe");
		ChromeDriver Driver = new ChromeDriver();
		Driver.get("D:\\Not so frequently used\\Front end\\html\\First.html");
		
		WebElement ele = Driver.findElement(By.id("123"));
		ele.sendKeys("admin"+Keys.TAB);//CharSequence
		WebElement ele2 = Driver.findElement(By.id("xyz"));
		ele2.sendKeys("1234");//CharSequence
	}
}
