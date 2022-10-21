package com.mouseHandling;
/**
 * mouseMethods robot class
 * 1. mousePress()
 * 2. mouseRelease
 * 3. mouseMove()
 * 
 * mouseMethods action class
 * 1. moveToElement()
 * 2. perform() --> to perform action written above
 * 3. build() --> prepares composite(group of) action
 */
import java.awt.AWTException; 
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse {
	public static void mouseUsingRobot() throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\java\\Drivers\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://testingshastra.com/");
		//robot class can be used to take screenshot
		Robot robo = new Robot();
		robo.mouseMove(200, 34);
		Thread.sleep(5000);
		Robot robo1 = new Robot();
		robo1.mouseMove(255, 320);
	}
	
	public static void mouseUsingActions() {
		System.setProperty("webdriver.chrome.driver", "D:\\java\\Drivers\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://testingshastra.com/");
		WebElement courses = driver.findElement(By.xpath("//a[contains(text(),'Courses')]"));
		Actions action = new Actions(driver);
		action.moveToElement(courses);
		action.perform();
	}
	
	public static void dragAndDrop() {
		System.setProperty("webdriver.chrome.driver", "D:\\java\\Drivers\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://testingshastra.com/assignments/drag-and-drop");
		WebElement course = driver.findElement(By.xpath("//img[@src='/images/java-selenium.png']"));
		WebElement target = driver.findElement(By.xpath("//div[@id='trash']"));
		Actions action = new Actions(driver);
		//action.clickAndHold(course).moveToElement(target).release().build().perform();
		action.dragAndDrop(course, target).perform();
		action.contextClick(course).build().perform();
		action.moveByOffset(30, 60).click().build().perform();
		driver.get("https://testingshastra.com/");
		Actions action1 = new Actions(driver);
		action1.moveByOffset(120, 100).perform();
		action1.click().perform();
		action1 .keyDown(Keys.SHIFT).sendKeys("hello").keyDown(Keys.SHIFT).build().perform();
	}
	public static void main(String[] args) throws AWTException, InterruptedException {
		//mouseUsingRobot();
		//mouseUsingActions();
		dragAndDrop();
	}
}
