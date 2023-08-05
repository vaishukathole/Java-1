package seleniumnewproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Linkslocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("WebDriver.chrome.driver" , "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.linkText("Create a Page")).click();

		driver.findElement(By.partialLinkText("Create ")).click();
		
		//System.setProperty("webdriver.geco.driver", "gecodriver.exe");
		
		//WebDriver driver = new FirefoxDriver();
		//driver.get("https://www.hostinger.in/");
		
		//driver.findElement(By.name("login")).click();
	
		
		
		
	
		
		
		
		
		
	}

}
