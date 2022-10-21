package SeleniumWaits;
import java.net.SocketTimeoutException;
/**
 * 1. implicitWait
 * 2. explicitWait
 */
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait; 

public class WaitsDemo {
	
	public static void implicitWait() throws InterruptedException , SocketTimeoutException{
		System.setProperty("webdriver.chrome.driver", "D:\\java\\Drivers\\chromedriver_win32_104\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("D:\\Not so frequently used\\Front end\\html iris\\ImplicitWaitDemo.html");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1500));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[contains(text(),'Click Me')]")).click();
		System.out.println("Clicked on Button");
		
		Thread.sleep(4000);
		driver.close();
	}
	
	public static void explicitWait() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\java\\Drivers\\chromedriver_win32_104\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("D:\\Not so frequently used\\Front end\\html iris\\ImplicitWaitDemo.html");
		
		FluentWait wait = new FluentWait<>(driver); 
		wait.pollingEvery(Duration.ofMillis(4000));
		wait.withTimeout(Duration.ofSeconds(60));
		wait.withMessage("60 Seconds are over. There's some performance issue.");
		wait.ignoring(ElementNotInteractableException.class); 
		//wait.ignoreAll(null);
		WebElement clickMe = driver.findElement(By.xpath("//button[contains(text(),'Click Me')]"));
		wait.until(ExpectedConditions.elementToBeClickable(clickMe));
		clickMe.click();
		System.out.println("Clicked on Button");
		
		Thread.sleep(4000);
		driver.close();
	}
	
	public static void webDriverWait() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\java\\Drivers\\chromedriver_win32_104\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("D:\\Not so frequently used\\Front end\\html iris\\ImplicitWaitDemo.html");
		
		JavascriptExecutor jse = null;
		FluentWait<JavascriptExecutor> wt = new FluentWait<JavascriptExecutor>(jse);
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60)); 
		wait.pollingEvery(Duration.ofMillis(4000));
		wait.withTimeout(Duration.ofSeconds(60));
		wait.withMessage("60 Seconds are over. There's some performance issue.");
		wait.ignoring(ElementNotInteractableException.class); 
		//wait.ignoreAll(null);
		WebElement clickMe = driver.findElement(By.xpath("//button[contains(text(),'Click Me')]"));
		wait.until(ExpectedConditions.elementToBeClickable(clickMe));
		clickMe.click();
		System.out.println("Clicked on Button");
		
		Thread.sleep(4000);
		driver.close();
	}
	public static void main(String[] args) throws InterruptedException, SocketTimeoutException {
		//implicitWait();
		//explicitWait();
		webDriverWait();
	}
}
