package com.browser.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Handles {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prathap J\\eclipse-workspace\\Selenium\\DRIVER\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();	 //upcasting
	driver.get("https://www.amazon.in/");
	//maximize
	driver.manage().window().maximize();
	//particular place
	JavascriptExecutor j= (JavascriptExecutor) driver;
	j.executeScript("window.scroll(0,1000)", " ");
	Thread.sleep(3000);	
	//Bottom of the page
	j.executeScript("window.scrollTo (0,document.body.scrollHeight)", "");
	Thread.sleep(3000);
	//Return to the top of the page
	j.executeScript("window.scroll(0,0)", "");
	Thread.sleep(2000);
	//Specific Element
	WebElement newrelease = driver.findElement(By.xpath("/html/body/div[1]/header/div/div[5]/div[2]/div/div/a[11]"));
	j.executeScript("arguments[0].scrollIntoView()",newrelease);
	Thread.sleep(3000);

}
}
