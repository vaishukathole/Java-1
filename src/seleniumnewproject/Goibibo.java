package seleniumnewproject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Goibibo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		System.setProperty("WebDriver.Chrome.driver", "chrome.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://www.goibibo.com/hotels/");
		
		driver.get("https://www.goibibo.com/flights/");
		
		//driver.findElement(By.xpath("//*[@id='downshift-1-input']")).sendKeys("Jaypur");
		
		
	//	WebElement dropdown = driver.findElement(By.xpath("//*[@id=\'grDropdown\']"));
				//Select s = new Select (dropdown);
				//s.selectByIndex(0);

		driver.findElement(By.xpath("//*[@class='sc-12foipm-33 djFwsb'][3]")).click();
		
		Thread.sleep(3000);
		
		
	List<WebElement> dates = driver.findElements(By.xpath("//*[@data-month='8']"));
		
		for (WebElement date:dates)
		{
			if (date.getText().equalsIgnoreCase("29"))
			{
				date.click();
				
				break;
			}
			
			
		}
		
		

	}

}
