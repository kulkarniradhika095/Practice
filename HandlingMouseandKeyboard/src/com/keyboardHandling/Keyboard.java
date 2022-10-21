package com.keyboardHandling;
/**
 * keyboardMethods
 * 1. keyPress()
 * 2. keyRelease()
 * 
 */
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.chrome.ChromeDriver;

public class Keyboard {
	public static void keyboardUsingRobot() throws AWTException {
		System.setProperty("webdriver.chrome.driver", "D:\\java\\Drivers\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://testingshastra.com/");
		
		
		Robot robo = new Robot();
		robo.keyPress(KeyEvent.VK_TAB);
		robo.keyRelease(KeyEvent.VK_TAB);
		
	}
	public static void main(String[] args) throws AWTException {
		keyboardUsingRobot();
	}
}
