package com.util;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webdr {
	
	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		RemoteWebDriver driver = new EdgeDriver();
		driver.get("https://www.goibibo.com/");
	}
}
