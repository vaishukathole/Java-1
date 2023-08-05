package seleniumnewproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("WebDriver.Chorme.driver", "chrome.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	
		//WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		//driver.switchTo().frame(frame);
		
		Actions ac = new Actions (driver);
		WebElement source = driver.findElement(By.id("box4"));
		WebElement target = driver.findElement(By.id("box101"));  
		ac.dragAndDrop(source, target).build().perform();

	}

}
