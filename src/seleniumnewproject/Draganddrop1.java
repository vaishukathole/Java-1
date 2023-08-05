package seleniumnewproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("WebDriver.Chorme.driver", "chrome.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.seleniumeasy.com/drag-and-drop-demo.html");
	
		Actions ac = new Actions (driver);
		Thread.sleep(3000);
		WebElement source = driver.findElement(By.xpath("//span[text()='Draggable 2']"));
		WebElement target = driver.findElement(By.id("mydropzone"));  
		ac.dragAndDrop(source, target).build().perform();

	}

}
