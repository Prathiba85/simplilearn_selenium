package test;

import java.awt.List;
import java.util.concurrent.TimeUnit;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class fb_signup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		WebElement signup = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']\r\n"));
		signup.click();

					
		WebElement fName = driver.findElement(By.xpath("//input[@name='firstname']"));
		WebElement lName = driver.findElement(By.xpath("//input[@name='lastname']"));
		WebElement mobile = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		WebElement password = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		
		fName.sendKeys("Prathiba");
		lName.sendKeys("sankar");
		mobile.sendKeys("sankar");
		password.sendKeys("chifley4");
		
		//dropdown
		//Default day
		WebElement defaultday = driver.findElement(By.xpath("//select[@title='Day']//option[@selected='1']"));
		System.out.println(defaultday.getText());
		
		
		//day
		WebElement day = driver.findElement(By.xpath("//select[@title='Day']"));
		Select sday= new Select(day);
		//sday.selectByValue("10");
		sday.selectByVisibleText("10");
		
		//select[@title='Month']
		WebElement month = driver.findElement(By.xpath("//select[@title='Month']"));
		Select smonth = new Select(month);
		smonth.selectByValue("3");
		java.util.List<WebElement>  allmonth = driver.findElements(By.xpath("//select[@title='Month']/option"));
		
		for(WebElement a:allmonth)
		{
			System.out.println(a.getText());
		}
		
		//year
		WebElement year = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select syear = new Select(year);
		syear.selectByValue("1985");
		
		//Radio button - Gender
		WebElement female =driver.findElement(By.xpath("//input[@type ='radio' and @value='1']"));
		female.click();
		
		//creating dynamic xpath
		
		
		String Gender="Male";
		
		String genderXpath = "//label[text()='placeholder']";
		String newxpath = genderXpath.replace("placeholder", Gender);
		System.out.println("New xpath is "+newxpath);
		
		//The other way of creating xpath
		//String newxpath = "//label[text()='+"+Gender+" ";
		WebElement genderElem =driver.findElement(By.xpath(newxpath));
		genderElem.click();
		
	
		
		WebElement create = driver.findElement(By.xpath("//button[@name='websubmit']"));
		create.click();

	}

}
