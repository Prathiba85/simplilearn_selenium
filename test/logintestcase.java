package test;

import java.awt.List;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class logintestcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.Launch chrome browser and open simplilear
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		//For reusability we are creating the object of webdriver. you need not to create objects for each driver.
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.simplilearn.com/");
		//2.maximize browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		
		//3.click login link on top right corner
		WebElement title =driver.findElement(By.tagName("title"));
		System.out.println("Title of the page is " +driver.getTitle());
	
		WebElement loginlink = driver.findElement(By.linkText("Log in"));
		String href=loginlink.getAttribute("href");
		System.out.println(href);
		
		
				
		
		loginlink.click();
		//4.enter the username
		
		WebElement username =driver.findElement(By.name("user_login"));
		username.sendKeys("sanprathi@gmail.com");
		
		
		
		//step 5-enter the password
		WebElement password = driver.findElement(By.id("password"));
		//password.sendKeys("Chifley08");
		password.sendKeys("Chifley8");
		
		WebElement rememberme = driver.findElement(By.className("rememberMe"));
		rememberme.click();
		
		//6.click on login button.
		WebElement login = driver.findElement(By.name("btn_login"));
		login.click();
		
		
		
		//7.Validate if the login is unsuccessful
		WebElement errormessage =driver.findElement(By.className("error_msg"));
		System.out.println("Error message is "+errormessage.getText());
		String actualerrormessage=errormessage.getText();
		String expectederrormessage="The email or password you have entered is invalid.";
		
		if (errormessage.isDisplayed() &&expectederrormessage.equals(actualerrormessage))
		{
			System.out.println("Test case passed");
		}
		
		else
			System.out.println("Test case failed");
		
		//get all links 
		//List <WebElement>  AllLinks =  driver.findElements(By.tagName("a"));
		
		java.util.List<WebElement> AllLinks = driver.findElements(By.tagName("a"));
		System.out.println(AllLinks.size());
		
		for(WebElement a : AllLinks)
		{
			System.out.println(a.getAttribute("href"));
			
		}
		
		driver.close();
		
		

	}

}
