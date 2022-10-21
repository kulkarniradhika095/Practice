package com.dropdownList;
/**
 * methods of select class
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdownList {
	public static void singleSelectdropdownList() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\java\\Drivers\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://testingshastra.com/assignments/drop-down");
		WebElement month = driver.findElement(By.xpath("//select[@class='single-select']"));
		Select sl = new Select(month);
		boolean isMultiple = sl.isMultiple();
		System.out.println(isMultiple);
		Thread.sleep(2000);
		sl.selectByVisibleText("June");
	}
	
	public static void multipleSelectDropdownList() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\java\\Drivers\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://testingshastra.com/assignments/drop-down");
		WebElement skills = driver.findElement(By.xpath("//select[@class='multi-select']"));
		Select sl = new Select(skills);
		boolean isMultiple = sl.isMultiple();
		System.out.println(isMultiple);
		Thread.sleep(2000);
		sl.selectByVisibleText("Selenium Grid");
		sl.selectByVisibleText("REST API Automation");
		
		Thread.sleep(4000);
		sl.deselectByVisibleText("Selenium Grid");
		sl.deselectByVisibleText("REST API Automation"); 
	}
	public static void main(String[] args) throws InterruptedException {
		//singleSelectdropdownList();
		multipleSelectDropdownList();
	}
}
