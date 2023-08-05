package seleniumnewproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browserchrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webDriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");

	}

}
