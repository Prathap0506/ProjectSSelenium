package com.browser.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

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

			//WebElement login = driver.findElement(By.name("login"));
			//login.click();
			Thread.sleep(3000);
			WebElement registration = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
			registration.click();
			Thread.sleep(3000);
			// Signup page
			WebElement Fname = driver.findElement(By.name("firstname"));
			Fname.sendKeys("Poo");
			WebElement Lname = driver.findElement(By.name("lastname"));
			Lname.sendKeys("malai");
			WebElement email = driver.findElement(By.name("reg_email__"));
			email.sendKeys("poo@gmail.com");
			WebElement pwd = driver.findElement(By.id("password_step_input"));
			pwd.sendKeys("90908");
			Thread.sleep(3000);
			WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
			Select s=new Select(day);
			s.selectByValue("22");
			WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
			Select s1 = new Select(month);
			s1.selectByIndex(0);
			WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
			Select s2=new Select(year);
			s2.selectByVisibleText("1996");
			WebElement gender = driver.findElement(By.xpath("//input[@type='radio'][1]"));
			gender.click();
			WebElement signup = driver.findElement(By.name("websubmit"));
			signup.click();



}
}