package com.first;

import org.openqa.selenium.Dimension;

import org.openqa.selenium.Point;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethodsDemo {
	public static void getSizeDemo(){
		System.setProperty("webdriver.chrome.driver", "D:\\java\\Drivers\\chromedriver_win32_104\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		
		Dimension dim = driver.findElement(By.xpath("//div/a[@class='myntraweb-sprite desktop-logo sprites-headerLogo']")).getSize();
		
		System.out.println("width: "+dim.getWidth()+"\t"+"Height: "+dim.getHeight());
	}
	public static void getLocation() {
		System.setProperty("webdriver.chrome.driver", "D:\\java\\Drivers\\chromedriver_win32_104\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		
		Point point = driver.findElement(By.xpath("//div/a[@class='myntraweb-sprite desktop-logo sprites-headerLogo']")).getLocation();
		System.out.println("x:"+point.getX()+"\t"+"y:"+point.getY());
	}
	
	public static void isSelected() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\java\\Drivers\\chromedriver_win32_104\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[@class]")).click();
		Thread.sleep(3000);
		boolean isSelected = driver.findElement(By.xpath("(//label[@class])[3]")).isSelected();
		System.out.println("Before Click: "+isSelected);

		driver.findElement(By.xpath("(//label[@class])[3]")).click();
		isSelected = driver.findElement(By.xpath("(//label[@class])[3]")).isSelected();
		Thread.sleep(3000);
		System.out.println("After Click: "+isSelected);
		
	}
	
	public static void isEnabled() {
		System.setProperty("webdriver.chrome.driver", "D:\\java\\Drivers\\chromedriver_win32_104\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("D:\\Not so frequently used\\Front end\\html\\Fourth.html");
		boolean isEnabled = driver.findElement(By.xpath("//button[@name='Cancel']")).isEnabled();
		System.out.println(isEnabled);
	}
	
	public static void isDisplayed() {
		System.setProperty("webdriver.chrome.driver", "D:\\java\\Drivers\\chromedriver_win32_104\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("D:\\Not so frequently used\\Front end\\html\\Fourth.html");
		boolean isDisplayed = driver.findElement(By.xpath("//button[@type='submit']")).isDisplayed();
		boolean isDisplayed1 = driver.findElement(By.xpath("//button[@name='Cancel']")).isDisplayed();
		System.out.println(isDisplayed);
		System.out.println(isDisplayed1);
	}
	public static void main(String[] args)throws InterruptedException {
		//getSizeDemo();
		//getLocation();
		//isSelected();
		isEnabled();
		isDisplayed();
	}
}
