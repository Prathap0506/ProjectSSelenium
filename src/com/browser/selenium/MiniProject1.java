	package com.browser.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MiniProject1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Prathap J\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		WebElement signup = driver.findElement(By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a"));
		signup.click();
		
		  driver.findElement(By.id("email_create")).sendKeys("poo@ymail.com");
		  WebElement create = driver.findElement(By.id("SubmitCreate"));
		  create.click();
		 
		Thread.sleep(3000);
		WebElement male = driver.findElement(By.xpath("//input[@id='id_gender1']"));
		male.click();
		WebElement Fname = driver.findElement(By.name("customer_firstname"));
		Fname.sendKeys("joe");
		WebElement Lname = driver.findElement(By.name("customer_lastname"));
		Lname.sendKeys("ma");
		//WebElement Email = driver.findElement(By.id("email"));
		//Email.sendKeys("poo@ymail.com");
		WebElement pwd = driver.findElement(By.id("passwd"));
		pwd.sendKeys("12345");
		Thread.sleep(3000);
		WebElement day = driver.findElement(By.xpath("//select[@id='days']"));
		Select s = new Select(day);
		s.selectByValue("5");
		WebElement month = driver.findElement(By.xpath("//select[@id='months']"));
		Select s1 = new Select(month);
		s1.selectByIndex(7);
		WebElement year = driver.findElement(By.xpath("//select[@id='years']"));
		Select s2 = new Select(year);
		s2.selectByIndex(8);
		WebElement check1 = driver.findElement(By.id("newsletter"));
		check1.click();
		WebElement check2 = driver.findElement(By.id("optin"));
		check2.click();
		// addrress
		WebElement FirstName = driver.findElement(By.id("firstname"));
		FirstName.sendKeys("Prathap");

		WebElement LastName = driver.findElement(By.id("lastname"));
		LastName.sendKeys("chris");

		WebElement company = driver.findElement(By.id("company"));
		company.sendKeys("Dell International services");

		WebElement address = driver.findElement(By.id("address1"));
		address.sendKeys("Anna Nagar");

		WebElement address1 = driver.findElement(By.id("address2"));
		address1.sendKeys("kurruku sandhu");

		WebElement city = driver.findElement(By.name("city"));
		city.sendKeys("washington");

		WebElement State = driver.findElement(By.xpath("//select[@id='id_state']"));
		Select s3 = new Select(State);
		s3.selectByVisibleText("Florida");

	WebElement pincode = driver.findElement(By.xpath("//input[@class='form-control uniform-input text']"));
	pincode.sendKeys("61231");
	
		/*
		 * WebElement country =
		 * driver.findElement(By.xpath("//select[@id='id_country']")); Select s4= new
		 * Select(country); s4.selectByValue("United States");
		 */
	Thread.sleep(3000);
	WebElement others = driver.findElement(By.name("other"));
	others.sendKeys("hi hello welcome");
	WebElement mob = driver.findElement(By.xpath("//input[@name='phone']"));
	mob.sendKeys("758585844323");
	WebElement phone = driver.findElement(By.xpath("//input[@name='phone_mobile']"));
	phone.sendKeys("75232344323");
	WebElement Faddress = driver.findElement(By.xpath("//input[@id='alias']"));
	Faddress.sendKeys("pillayar koil street");
	WebElement submit = driver.findElement(By.xpath("//button[@id='submitAccount']"));
	submit.click();
	
	//back to home
	
	WebElement home = driver.findElement(By.xpath("//a[@class='home']"));
	home.click();
	
	WebElement t_shirt = driver.findElement(By.xpath("//a[@title='T-shirts']"));
	t_shirt.click();
	
	Point p = new Point(700,900);
	driver.manage().window().setPosition(p);
	Thread.sleep(3000);
	
	
	}

}
