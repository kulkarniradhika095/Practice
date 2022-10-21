package com.takeScreenshot;

import java.awt.image.BufferedImage;


import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class TakeScreenshotDemo2 {
	public static void screenshotUsingAShot() throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\java\\Drivers\\chromedriver_win32_103\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://mvnrepository.com/artifact/ru.yandex.qatools.ashot/ashot/1.5.4");
		Thread.sleep(2000);
		AShot ashot = new AShot();
		ashot.shootingStrategy(ShootingStrategies.viewportPasting(1000));
		Screenshot sc = ashot.takeScreenshot(driver);
	    BufferedImage img = sc.getImage();
	    ImageIO.write(img, "JPG", new File("usingAshot.jpg"));
	    driver.close();
	    
	    
	}
	
	public static void ashotMethods() throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\java\\Drivers\\chromedriver_win32_103\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
	    driver.get("https://testingshastra.com/");
	    AShot ashot = new AShot();
	    ashot.addIgnoredElement(By.xpath("//ul[@id='primary-menu']"));
	    ashot.shootingStrategy(ShootingStrategies.viewportPasting(1000));
	    Screenshot sc1 = ashot.takeScreenshot(driver);
	    BufferedImage img1 = sc1.getImage();
	    ImageIO.write(img1, "JPG", new File("usingAshot1.jpg"));
	    Thread.sleep(5000);
		driver.close();
	}
	
	public static void main(String[] args) throws IOException, InterruptedException {
		screenshotUsingAShot();
		ashotMethods();
	}
}
