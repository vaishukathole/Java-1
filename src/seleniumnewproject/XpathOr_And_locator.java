package seleniumnewproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathOr_And_locator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("WebDirver.chrome.driver", "chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		// cssSelector
		
		//driver.findElement(By.cssSelector("input[data-testid=\"royal_email\"]")).sendKeys("vk@gmail.com");
				
				
		


	}

}
