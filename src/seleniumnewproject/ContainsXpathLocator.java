package seleniumnewproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContainsXpathLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("WebDirver.chrome.driver", "chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		
		driver.get("https://www.hackerrank.com/");
		
		//driver.findElement(By.xpath("//*[contains(@class=\"inputtext _55r1 _6luy\"]")).sendKeys("vk@gmail.com");
		
driver.findElement(By.xpath("//*[contains(@href=\"/products/pricing/\")]")).click();
		
		
		// cssSelector
		
		//driver.findElement(By.cssSelector("input[data-testid=\"royal_email\"]")).sendKeys("vk@gmail.com");
		
		


	}

}
