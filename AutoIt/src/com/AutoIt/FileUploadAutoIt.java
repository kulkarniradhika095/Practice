package com.AutoIt;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadAutoIt {
	public static void main(String[] args) throws IOException, InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\java\\Drivers\\chromedriver_win32_103\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("file:///D:/Not%20so%20frequently%20used/Front%20end/html%20iris/FileUpoload.html");
	
	Thread.sleep(2000);
	driver.executeScript("document.querySelector(\"input\").click()");
	Thread.sleep(2000);
	Runtime.getRuntime().exec("D:\\java\\AutoIt\\autoItFiles.exe");
	
	
	}
}