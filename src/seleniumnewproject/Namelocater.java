package seleniumnewproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Namelocater {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		
System.setProperty("WebDriver.chrome.driver" , "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.name("email")).sendKeys("vk12@gmail.com");
		
		driver.findElement(By.name("pass")).sendKeys("vk12345.");
		
		driver.findElement(By.name("login")).click();
		

	}

}
