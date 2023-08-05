package seleniumnewproject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Actionclass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

	
		
		System.setProperty("WebDriver.Chorme.driver", "chrome.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		/*Actions v= new  Actions (driver);
		WebElement a = driver.findElement(By.id("nav-global-location-popover-link"));
		v.moveToElement(a).build().perform();
		v.moveToElement(a).click().build().perform();*/
		
		WebElement w = driver.findElement(By.id("twotabsearchtextbox"));
		v.moveToElement(w).click().keyUp(Keys.SHIFT).sendKeys("m").keyDown(Keys.SHIFT).sendKeys("obile").build().perform();
		
		v.moveToElement (w).click().sendKeys("Mobile").build().perform();
		
		v.doubleClick(w).build().perform();
		
		v.contextClick(w).build().perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//driver.get("https://www.firstcry.com/");
		
				//Actions m = new Actions (driver);
				//WebElement d = driver.findElement(By.id("city_pin_data"));
				//m.moveToElement(d).build().perform();
				//m.moveToElement(d).click().build().perform();
				
				//WebElement k = driver .findElement(By.id("search_box"));
				//m.contextClick(k).build().perform();
				//m.click(k).sendKeys("Vaishali").build().perform();
				
				

	}

	
}
