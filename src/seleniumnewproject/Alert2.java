package seleniumnewproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;

public class Alert2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		WebElement al = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
		
		al.click();
		driver.switchTo().alert().accept();
	
		WebElement al1 = driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
		al1.click();
		driver.switchTo().alert().dismiss();
		
		WebElement al2 = driver.findElement(By.xpath("//*[@onclick='jsPrompt()']"));
				al2.click();
				
		Alert a =  driver.switchTo().alert();
		a.sendKeys("Vaishali");
		//System.out.println(a.getText());
		a.accept();
			
				

	}

}
