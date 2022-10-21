package com.first;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssValue {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\java\\Drivers\\chromedriver_win32_104\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		//get color of webElement
		String color = driver.findElement(By.xpath("//span[@class='a-button a-spacing-top-mini a-button-span12 a-button-primary sign-in-button']")).getCssValue("color");
		
		System.out.println(color);
		driver.close();
	}
}
