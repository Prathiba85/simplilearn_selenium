package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fblogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//For reusability we are creating the object of webdriver. you need not to create objects for each driver.
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com//");
		//2.maximize browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		
WebElement email= driver.findElement(By.name("email"));
email.sendKeys("sanprathi");

WebElement password = driver.findElement(By.id("pass"));
password.sendKeys("test");

WebElement login = driver.findElement(By.name("login"));
login.click();

	}

}
