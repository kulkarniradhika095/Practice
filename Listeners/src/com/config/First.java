package com.config;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.util.MyListener;

import io.github.bonigarcia.wdm.WebDriverManager;


//@Listeners(MyListener.class)
public class First extends Config{
	
	//@Test
	public static void m1() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver =  new ChromeDriver();
		driver.get("https://ijmeet.com/register?csrt=2207161033905554373");
		Thread.sleep(2000);
		((WebElement) driver.executeScript("//button[@class='btn btn-block btn-primary btn-lg font-weight-medium auth-form-btn mirror-view-btn-primary']")).click();
		String errorMsg = driver.findElement(By.xpath("//label[@id='name-error-server']")).getText();
		Assert.assertEquals("hi", "hello");
		System.out.println(errorMsg);
		}
	public static void main(String[] args) throws InterruptedException {
		m1();
	}
	}
	
	
	

