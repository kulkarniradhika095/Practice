package com.handlePopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupHandling {
	
	public static void handlePopup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\java\\Drivers\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://getbootstrap.com/docs/4.0/components/modal/");
		driver.findElement(By.xpath("(//button[@class='btn btn-primary'])[3]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//button[contains(text(),'Save changes')])[2]")).click();
		
		driver.close();
	}
	public static void main(String[] args) throws InterruptedException {
		handlePopup();
	}
}
