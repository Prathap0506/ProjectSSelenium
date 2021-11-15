package com.browser.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prathap J\\eclipse-workspace\\Selenium\\DRIVER\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Frames.html");
	//max
	driver.manage().window().maximize();
	//single frame
	WebElement single_Frame = driver.findElement(By.xpath("//iframe[@id='singleframe']"));
	driver.switchTo().frame(single_Frame);
	WebElement text = driver.findElement(By.xpath("//input[@type='text']"));
	text.sendKeys("Prathap");
	//back from home
	driver.switchTo().defaultContent();	
	WebElement nested_button = driver.findElement(By.xpath(" /html/body/section/div[1]/div/div/div/div[1]/div/ul/li[2]/a"));
	nested_button.click();
	//outer frame
	WebElement outer = driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[2]/div[2]/iframe"));
	driver.switchTo().frame(outer);
	//inner frame
	WebElement inner = driver.findElement(By.xpath("//iframe[@style='float: left;height: 250px;width: 400px']"));
	driver.switchTo().frame(inner);	
	//text
	WebElement text1 = driver.findElement(By.xpath("/html/body/section/div/div/div/input"));
	text1.sendKeys("Ronaldo");
	Thread.sleep(3000);
	driver.quit();
	
}
}
