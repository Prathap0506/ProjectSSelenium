package com.browser.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
public static void main(String[] args) throws InterruptedException {
	

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prathap J\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();	
	driver.get("http://demo.automationtesting.in/Alerts.html");
	//max
	driver.manage().window().maximize();	
	//simple alert	
	WebElement simple_button = driver.findElement(By.xpath("//button[contains(@class,'btn btn-danger')]"));
	simple_button.click();
	driver.switchTo().alert().accept();
	Thread.sleep(2000);
	//confirm alert
	WebElement confirm = driver.findElement(By.linkText("Alert with OK & Cancel"));
	confirm.click();
	WebElement confirm_alert = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/button"));
	confirm_alert.click();
	driver.switchTo().alert().dismiss();
	//prompt alert
	WebElement prompt = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a"));
	prompt.click();
	WebElement prompt_alert = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[3]/button"));
	prompt_alert.click();
	driver.switchTo().alert().sendKeys("Prathap");
	driver.switchTo().alert().accept();
	Thread.sleep(2000);
	driver.quit();
		
	
}


}

