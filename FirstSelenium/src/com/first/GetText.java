package com.first;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {
	
	public static void main(String[] args) {
		
		
		//get text written in the webElement  
		System.setProperty("webdriver.chrome.driver", "D:\\java\\Drivers\\chromedriver_win32_104\\chromedriver.exe");
		ChromeDriver driver1 = new ChromeDriver();
		driver1.get("https://www.myntra.com/");
		String text = driver1.findElement(By.xpath("//div/h4[@class='text-banner-title']")).getText();
		System.out.println(text);
	}
}
