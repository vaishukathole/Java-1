package LinkdinSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatorid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//System.setProperty("WebDriver.chrome.driver" , "chromedriver.exe");
		
		//WebDriver driver = new ChromeDriver();
		
		
		//driver.get("https://www.flipkart.com//");
		
		System.setProperty("WebDriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.linkedin.com/");
		

		//WebElement email = driver.findElement(By.id("email"));
				//email.sendKeys("wamankathole62@gmail.com");
				
		 driver.findElement(By.id("session_key")).sendKeys("vk@gmail.com");
		 
		 driver.findElement(By.id("session_password")).sendKeys("vk12345");
		 
		 driver.findElement(By.id("sign-in-form__submit-btn")).click();
		
		
				

	}

}
