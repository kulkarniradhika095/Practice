package HandlingFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	
	public static void handleFrame() {
		System.setProperty("webdriver.chrome.driver", "D:\\java\\Drivers\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///D:/Not%20so%20frequently%20used/Front%20end/html%20iris/FrameDemo.html");
		
		driver.switchTo().frame(0);//Overloaded
		driver.findElement(By.xpath("//input[@name='fname']")).sendKeys("Avinash");
		
		driver.switchTo().frame(0);//Overloaded
		driver.findElement(By.xpath("//input[@name='lname']")).sendKeys("Pingale");
		
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//button[@name='ok-btn']")).click();
	}
	
	
	public static void main(String[] args) {
		handleFrame();
	}
}
