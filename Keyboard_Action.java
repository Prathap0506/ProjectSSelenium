package com.browser.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_Action {
public static void main(String[] args) throws AWTException, InterruptedException {

	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Prathap J\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.myntra.com/");
	
	// maximize
	driver.manage().window().maximize();
	
	//mouse action
	Actions a = new Actions(driver);
	
	WebElement men = driver.findElement(By.xpath("//a[@data-group='men']"));
	a.contextClick(men).build().perform();  //Right Click
	Thread.sleep(3000);
	//keyboard actions
	
	Robot r = new Robot();
	 
	r.keyPress(KeyEvent.VK_DOWN); // new tab open
	r.keyRelease(KeyEvent.VK_DOWN);
	
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);

	WebElement beauty = driver.findElement(By.xpath("//a[@data-group='beauty']"));
	a.contextClick(beauty).build().perform();
	
	r.keyPress(KeyEvent.VK_DOWN);










}
	
}
