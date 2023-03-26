package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtable_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		List<WebElement> all_rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		List<WebElement> all_columns = driver.findElements(By.xpath("//table[@id='customers']//th"));
		System.out.println("Row number " +all_rows.size());
		System.out.println("Column number " +all_columns.size());
		
		//You can use // -->//ta
		/*
		for(WebElement row:all_rows)
		{
			System.out.println(row.getText());
		}
		
		WebElement tablevalue = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[4]/td[1]"));
		System.out.println();
		*/
		
		

		
	
for (int i=2;i<all_rows.size();i++)
{
	for(int j=0;j<all_columns.size();j++)
	{
List<WebElement> ColumnsData = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[" + i + "]/td[" + j + "]"));
	
	System.out.print(ColumnsData.get

	}
	System.out.println();
}
	
 
		driver.close();

	}

}
