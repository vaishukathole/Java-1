package seleniumnewproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpathLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("WebDriver.chrome.driver" , "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://byjus.com/");
		
		driver.findElement(By.xpath("/html[1]/body/header/nav/div/div/a[2]/login")).click();

	}

}
