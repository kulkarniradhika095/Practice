package com.handlingWindows;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {
		public static void getWindowHandle() {
		System.setProperty("webdriver.chrome.driver", "D:\\java\\Drivers\\chromedriver_win32_104\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///D:/Not%20so%20frequently%20used/Front%20end/html%20iris/HandlingMultipleWindows.html");
		driver.findElement(By.xpath("//button[contains(text(),'Try')]")).click();

		String handle = driver.getWindowHandle();
		
		
		System.out.println(handle);
		driver.findElement(By.xpath("//button[contains(text(),'Click')]")).click();

		
		}
		public static void getWindowHandles() {
			System.setProperty("webdriver.chrome.driver", "D:\\java\\Drivers\\chromedriver_win32_104\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.get("file:///D:/Not%20so%20frequently%20used/Front%20end/html%20iris/HandlingMultipleWindows.html");
			driver.findElement(By.xpath("//button[contains(text(),'Try')]")).click();

			
			Set<String> handles = driver.getWindowHandles();
			
			for (String handle : handles) {
				driver.switchTo().window(handle);
				if (driver.getTitle().contains("First")) {
					break;
				} 
			}
			driver.findElement(By.xpath("//button[contains(text(),'Click')]")).click();

			
			for (String handle : handles) {
				driver.switchTo().window(handle);
				if (driver.getCurrentUrl().contains("Second")) {
					break;
				} 
			}
			driver.findElement(By.xpath("//button[contains(text(),'Click')]")).click();
			
			for (String handle : handles) {
				driver.switchTo().window(handle);
				
				try {
					if(driver.findElement(By.xpath("//h2")).getText().contains("Fourth"));
						break;
				}catch (org.openqa.selenium.NoSuchElementException e) {
					
				}
			}
			driver.findElement(By.xpath("//button[contains(text(),'Click')]")).click();
		}
		
		
		public static void main(String[] args) {
			//getWindowHandle();
			getWindowHandles();
		}
}		
