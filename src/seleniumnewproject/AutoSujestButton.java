package seleniumnewproject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSujestButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("WebDriver.chrome.driver", "chromedriver.exe");
		
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://rahulshettyacademy.com/dropdownsPractise/#");
	
	//WebElement p = driver.findElements(By.id("autosuggest"));
	WebElement p = driver.findElement(By.id("autosuggest"));
	p.sendKeys("in");
	
	Thread.sleep(3000);
	 List<WebElement> options = driver.findElements(By.xpath("//*[@class='ui-menu-item']/a"));
	
	 for(WebElement option :options)
	 {
		 if(option.getText().equalsIgnoreCase("india"))
		 {
		 option.click();
		 break;
		 }
	 }

	}

}
