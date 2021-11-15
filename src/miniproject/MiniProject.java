package miniproject;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.baseclass.com.Seleniumbase;

public class MiniProject extends Seleniumbase {

	public static WebDriver driver;
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Prathap J\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		WebElement signin = driver.findElement(By.xpath("//a[@class='login']"));
		signin.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 WebElement scroll = driver.findElement(By.xpath("//div[@id='center_column']//form"));
		js.executeScript("window.scrollBy(0,200);");
		WebElement user = driver.findElement(By.xpath("//input[@id='email']"));
		//user.sendKeys("poo@ymail.com");
		inputvalues(user, "poo@ymail.com");
		WebElement pass = driver.findElement(By.xpath(" //input[@id='passwd']"));
		//pass.sendKeys("12345");
		inputvalues(pass, "12345");
		WebElement login = driver.findElement(By.xpath("//button[@name='SubmitLogin']"));
		//login.click();
		clickelement(login);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement Dress = driver.findElement(By.xpath("(//a[@title=\"Dresses\"])[2]"));
		Dress.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement EveDress = driver.findElement(By.xpath("//a[@title='Evening Dresses']//img[@class='replace-2x']"));
		EveDress.click();
		WebElement printedDress = driver.findElement(By.xpath("//a[@title='Printed Dress'][normalize-space()='Printed Dress']"));
		printedDress.click();
		
		WebElement quantity = driver.findElement(By.xpath("//i[@class='icon-plus']"));
		for (int i = 0; i < 9; i++) {
			quantity.click();
		}
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		 WebElement Scroling = driver.findElement(By.xpath("//div[@id='center_column']//form"));
		js2.executeScript("window.scrollBy(0,100);");
		WebElement size = driver.findElement(By.xpath("//select[@id='group_1']"));
		Select s = new Select(size);
		s.selectByValue("3");
		WebElement color = driver.findElement(By.xpath("//a[@id='color_24']"));
		color.click();
		WebElement addtocart = driver.findElement(By.xpath("//span[normalize-space()='Add to cart']"));
		addtocart.click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		//screenshot("pic");
		WebElement proceedTocheckOut = driver.findElement(By.xpath("//span[normalize-space()='Proceed to checkout']"));
		proceedTocheckOut.click();
		WebElement checkout2 = driver.findElement(By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']//span[contains(text(),'Proceed to checkout')]"));
		checkout2.click();
		Thread.sleep(4000);
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		 WebElement bottom = driver.findElement(By.xpath("//div[@id='center_column']//form"));
		js1.executeScript("window.scrollBy(0,300);");
		WebElement submit2 = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		submit2.click();
		WebElement agree = driver.findElement(By.xpath("//input[@id='cgv']"));
		agree.click();
		WebElement click3 = driver.findElement(By.xpath("(//span[contains(text(),'Proceed to checkout')])[2]"));
		click3.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    WebElement pay = driver.findElement(By.xpath("//a[@title='Pay by bank wire']"));
	    pay.click();
	    WebElement confirmOrder = driver.findElement(By.xpath("(//span[normalize-space()='I confirm my order'])[1]"));
	    confirmOrder.click();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    js.executeScript("window.scrollBy(0,200);");
	    TakesScreenshot shot =  (TakesScreenshot) driver;   //narrowcasting
		File source = shot.getScreenshotAs(OutputType.FILE);
		File Destination = new File("C:\\Users\\Prathap J\\eclipse-workspace\\Selenium\\Screenshot\\orderConfirm.png");
		FileUtils.copyFile(source, Destination);
		driver.close();

	}
}
