package seleniumnewproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Csslink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("WebDriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.goindigo.in/?cid=Display|Affiliate|LF|LA56|8|");
		driver.findElement(By.xpath("//*[@placeholder='From']")).click();
		
		

	}

}
