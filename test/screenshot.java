package test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
			// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.simplilearn.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
			
			 //Add admin@the internet : You can pas s the username and password from excel or csv file
				driver.get("https://www.facebook.com/");
				driver.manage().window().maximize();
				TakesScreenshot tsobj = (TakesScreenshot) driver;
				File fileobj =tsobj.getScreenshotAs(OutputType.FILE);
				File screenshot = new File ("image.png");
				FileUtils.copyFile(fileobj, screenshot);


	}

}
