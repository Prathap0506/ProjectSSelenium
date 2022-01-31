package com.browser.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Prathap J\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/drop.html");
		// maximize
		driver.manage().window().maximize();

		Actions a = new Actions(driver);
		WebElement from_elem = driver.findElement(By.id("draggable"));
		WebElement to_elem = driver.findElement(By.id("droppable"));
		Thread.sleep(3000);
		a.dragAndDrop(from_elem, to_elem).build().perform();
		Thread.sleep(3000);
		driver.quit();

	}
}
