package LinkdinSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkdinLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("WebDriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.linkedin.com/");
		
		//driver.findElement(By.name("session_key")).sendKeys("vk12@gmail.com");
		//driver.findElement(By.name("session_password")).sendKeys("vk12@12345");
		//driver.findElement(By.name("Sign in")).click();
		

		driver.findElement(By.classname("session_key")).sendKeys("vk12@gmail.com");
		driver.findElement(By.name("session_password")).sendKeys("vk12@12345");
		driver.findElement(By.name("Sign in")).click();
		

	}

}
