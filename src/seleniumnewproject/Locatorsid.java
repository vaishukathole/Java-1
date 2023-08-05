package seleniumnewproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatorsid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("WebDriver.chrome.driver" , "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.facebook.com/");
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("vk@gmail.com");
		
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("1997@");
		
		WebElement login= driver.findElement(By.tagName("button"));
		login.click();
		
		
		
		
		
		
		
		
		
		//WebElement email = driver.findElement(By.id("email"));
				//email.sendKeys("wamankathole62@gmail.com");
				
				//WebElement pass = driver.findElement(By.id("pass"));
				//pass.sendKeys("1962@");
		//WebElement login= driver.findElement(By.tagName("button"));
		//login.click();
		
		//WebElement email = driver.findElement(By.id("email"));
		//email.sendKeys("wamankathole62@gmail.com");
		//
		//WebElement pass = driver.findElement(By.id("pass"));
		//pass.sendKeys("wamankathole62@");
		
		//WebElement login= driver.findElement(By.tagName("button"));
				//login.click();
				
		
		
		

	}

}
