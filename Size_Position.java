package com.browser.selenium;



import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Size_Position {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Prathap J\\eclipse-workspace\\Selenium\\DRIVER\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		// max
		driver.manage().window().maximize();
		Thread.sleep(3000);
		// To Set a size
		
		Dimension size = new Dimension(900,900);
		driver.manage().window().setSize(size);
		Thread.sleep(3000);
		//To set a position
		
		Point p = new Point(700,900);
		driver.manage().window().setPosition(p);
		Thread.sleep(3000);
		
		//accessing FB
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("pooo@gamil.com");
		
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("9u878776");
		
		WebElement login = driver.findElement(By.name("login"));
		login.click();
	}

}
