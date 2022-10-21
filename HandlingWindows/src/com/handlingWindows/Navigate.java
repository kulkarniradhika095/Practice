package com.handlingWindows;

import java.net.SocketException;
import java.net.SocketTimeoutException;

import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
		public static void main(String[] args) throws InterruptedException , SocketTimeoutException ,SocketException {
		System.setProperty("webdriver.chrome.driver","D:\\java\\Drivers\\chromedriver_win32_104\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com");
		Thread.sleep(1000);
		System.out.println("Naukri page is opened");
		driver.navigate().to("http://www.testingshastra.com");
		Thread.sleep(1000);
		System.out.println("Testing shastra page is opened");
		driver.navigate().back(); //On this line, naukri.com will open
		Thread.sleep(1000);
		System.out.println("Naukri page is opened");
		driver.navigate().forward(); //On this line, testingshastra.com will open
		Thread.sleep(1000);
		System.out.println("Testing shastra page is opened");
		driver.close();
		}
	}
