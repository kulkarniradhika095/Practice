package robotClass;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotRobotClass {
	
	public static void main(String[] args) throws AWTException, IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\java\\Drivers\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://testingshastra.com/");
		
		Robot robo = new Robot();
		Rectangle rect = new Rectangle();
		rect.setSize(1280, 800);
		BufferedImage img = robo.createScreenCapture(rect);
		File outputfile = new File("img.jpg");
		ImageIO.write(img, "jpg", outputfile);
		
		driver.close();
	}
}
