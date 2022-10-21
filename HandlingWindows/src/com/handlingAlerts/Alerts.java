package com.handlingAlerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * in Alert(I) there are 4 alerts and 4 methods associated to it
 * 1. accept()  --> ok button (Alert)
 * 2. dismiss() --> cancel
 * 3. getText() --> Text message
 * 4. sendKeys() --> Text box
 * @author radhi
 */
public class Alerts {
	public static void simpleAlert() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\java\\Drivers\\chromedriver_win32_104\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://testingshastra.com/assignments/simple-alert");
		driver.findElement(By.xpath("//input[@id='user']")).sendKeys("Radhika");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='alert-btn']")).click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		alert.accept();
		Thread.sleep(2000);
		driver.close();
		
	}
	
	public static void promptAlert() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\java\\Drivers\\chromedriver_win32_104\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://testingshastra.com/assignments/prompt");
		driver.findElement(By.xpath("//button[@class='alert-btn']")).click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Radhika Kulkarni");
		Thread.sleep(2000);
		alert.accept();
		alert.sendKeys("25");
		Thread.sleep(2000);
		alert.accept();
		Thread.sleep(2000);
		driver.close();
	}
	
	public static void confirmationAlert() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\java\\Drivers\\chromedriver_win32_104\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://testingshastra.com/assignments/confirmation-alert");
		driver.findElement(By.xpath("//button[@class='alert-btn']")).click();
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		alert.accept();
		Thread.sleep(2000);
		driver.close();
	}
	public static void main(String[] args) throws InterruptedException {
		simpleAlert();
		//promptAlert();
		//confirmationAlert();
	}
	
}
