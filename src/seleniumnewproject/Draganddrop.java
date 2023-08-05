package seleniumnewproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("WebDriver.Chorme.driver", "chrome.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
	
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame);
		
		Actions ac = new Actions (driver);
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));  
		ac.dragAndDrop(source, target).build().perform();
		
		
	}

}
