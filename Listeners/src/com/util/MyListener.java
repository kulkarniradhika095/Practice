package com.util;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.config.Config;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class MyListener implements ITestListener{
	
	@Override
	public void onTestFailure(ITestResult result) {
		AShot ashot = new AShot();
		ashot.shootingStrategy(ShootingStrategies.viewportPasting(1000));
		BufferedImage img = ashot.takeScreenshot(Config.driver).getImage();
		String baseDir = System.getProperty("user.dir");
		try {
			ImageIO.write(img, "JPG", new File(baseDir+"/Screenshots/failed.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
