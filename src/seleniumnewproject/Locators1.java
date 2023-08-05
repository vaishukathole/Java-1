package seleniumnewproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("WebDriver.chrome.driver" , "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.flipkart.com//");
		
		WebElement login= driver.findElement(By.tagName("button"));
		login.click();
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("wamankathole62@gmail.com");

}
}