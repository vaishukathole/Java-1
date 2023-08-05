package MsebWebpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homwebepage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chorme.driver", "ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.mahadiscom.in/en/home/");
		 driver.findElement(By.xpath("//*[text()='Close']")).click();
		 
		 driver.findElement(By.id("cse-search-input-box-id")).sendKeys("12345678");

			driver.findElement(By.name("A")).sendKeys("490110465561");

			driver.findElement(By.name("terms")).click();
			
			
			//driver.findElement(By.xpath("//*[@value='Pay Now']")).click();
			
			driver.findElement(By.linkText(("Mukhyamantri Saur Krushi Vahini Yojana – 2.0"))).click();
			
			//driver.findElement(By.name("nav-link dropdown-toggle active")).click();
			
			//driver.findElement(By.linkText(("Project Progress"))).click();
			
			//driver.findElement(By.xpath("//*[@id='prjProgDropdown']")).click();
			driver.findElement(By.id("prjProgDropdown")).click();
			
	
			
			
			
			
			
			
			
			
			
			

	}

}
