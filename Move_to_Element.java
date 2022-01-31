package com.browser.selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Move_to_Element {
public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prathap J\\eclipse-workspace\\Selenium\\DRIVER\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();	 //upcasting
	driver.get("https://www.myntra.com/");
	//max
	driver.manage().window().maximize();
	
	Actions  a =new Actions(driver);
	WebElement men = driver.findElement(By.xpath("/html/body/div[1]/div/div/header/div[2]/nav/div/div[1]/div/a"));
	a.moveToElement(men).build().perform();
	Thread.sleep(3000);	
	
	
	WebElement Fshoes = driver.findElement(By.xpath("/html/body/div[1]/div/div/header/div[2]/nav/div/div[1]/div/div/div/div/li[3]/ul/li[4]/a "));
	Fshoes.click();
	Thread.sleep(3000);
	//Take Screenshot
	
	TakesScreenshot shot =  (TakesScreenshot) driver;   //narrowcasting
	File source = shot.getScreenshotAs(OutputType.FILE);
	File Destination = new File("C:\\Users\\Prathap J\\eclipse-workspace\\Selenium\\Screenshot\\Formalshoes.png");
	FileUtils.copyFile(source, Destination);
	driver.quit();


}
}
