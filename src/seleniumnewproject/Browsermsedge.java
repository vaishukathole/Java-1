package seleniumnewproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browsermsedge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.edge.driver", "msedgedriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.amazon.com/ap/signin/");


		//driver.getCurrentUrl();
		//System.out.println(driver.getCurrentUrl());

		//driver.getTitle();
		//System.out.println(driver.getTitle());
		
		//driver.getPageSource();
		//System.out.println(driver.getPageSource());
		
		//driver.close();
		//driver.quit();
		
	}

}
