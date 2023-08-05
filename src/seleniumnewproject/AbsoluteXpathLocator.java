package seleniumnewproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXpathLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("WebDriver.chrome.driver" , "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.meesho.com/");
		
		driver.findElement(By.xpath("html/body/div/div[2]/div[1]/div/div[2]/div/input")).sendKeys("Electronic");

	}

}
