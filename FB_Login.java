package com.browser.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB_Login {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Prathap J\\eclipse-workspace\\Selenium\\DRIVER\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();

			driver.get("https://www.facebook.com/");

			// maximize

			driver.manage().window().maximize();
			Thread.sleep(3000);

			// To set size

			//Dimension size = new Dimension(300, 400);
			//driver.manage().window().setSize(size);

			// To set a position

			//Point position = new Point(300, 400);
			//driver.manage().window().setPosition(position);

			// Accessing User name and Password

			WebElement userName = driver.findElement(By.id("email"));
			userName.sendKeys("Prathap");

			WebElement pass = driver.findElement(By.name("pass"));
			pass.sendKeys("123456");

			WebElement login = driver.findElement(By.name("login"));
			login.click();
}
}