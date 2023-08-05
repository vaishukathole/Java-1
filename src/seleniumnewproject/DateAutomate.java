package seleniumnewproject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DateAutomate {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("WebDriver.Chrome.driver", "chrome.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/#");
		
		driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
		driver.findElement(By.xpath("//*[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		Thread.sleep(2000);
		List<WebElement> dates = driver.findElements(By.xpath("//*[@data-month='8']"));
	
		
		
		
		for (WebElement date:dates)
		{
			if (date.getText().equalsIgnoreCase("30"))
			{
				date.click();
				
				break;
			}
			
			
		}
		
		
		

	}

}
