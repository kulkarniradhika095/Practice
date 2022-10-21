package com.notAutoIt;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadUseofSendkeys {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\java\\Drivers\\chromedriver_win32_103\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("file:///D:/Not%20so%20frequently%20used/Front%20end/html%20iris/FileUpoload.html");
	driver.findElement(By.xpath("//input")).sendKeys("D:\\My test Cases.xlsx");
	}
}
