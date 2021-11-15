package com.baseclass.com;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Seleniumbase {
	public static WebDriver driver;

	public static WebDriver BrowserLaunch(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prathap J\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		}

		else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Prathap J\\eclipse-workspace\\MavenProject\\Driver\\firefox.exe");
		} else {
			System.out.println("Invalid Browser, check the broswer name");
		}
	 // driver.manage().window().maximize();
		return driver;
}

	
	public static void screenshot(String pic) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File Destination = new File("C:\\Users\\Prathap J\\eclipse-workspace\\Selenium\\Screenshot\\"+pic + ".png");
		FileUtils.copyFile(source, Destination);

	}

	public static void inputvalues(WebElement element, String str) {
		
		element.sendKeys(str);
		
	}

	public static void clickelement(WebElement element) {
		element.click();

	}
	public static void robot(WebElement element) throws AWTException {

		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

	}


	// Implicit Wait

	public static void ImpWait(int time) {
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);

	}

	// Explicit Wait

	public static void explicitwait(long seconds, WebElement element) {

		try {
			WebDriverWait wait = new WebDriverWait(driver, seconds);
			wait.until(ExpectedConditions.visibilityOf(element));

		} catch (Exception e) {
		}
	}
	
}
