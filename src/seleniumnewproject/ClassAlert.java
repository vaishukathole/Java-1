package seleniumnewproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;

public class ClassAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("WebDriver.Chorme.driver", "chrome.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.seleniumeasy.com/javascript-alert-box-demo.html");
		
		//WebElement alert = driver.findElement(By.xpath("//button[@class='btn btn-default']"));
		
		//alert.click();
		//driver.switchTo().alert().accept();
	
		//WebElement alert1 = driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']"));
		//alert1.click();
		//driver.switchTo().alert().dismiss();
		
		WebElement alert2 = driver.findElement(By.xpath("//*[@onclick='myPromptFunction()']"));
		ClassAlert b =  driver.switchTo().alert();
		b.sendKeys("Vaishali");
		//System.out.println(a.getText());
		a.accept();
		
		
		
		/*driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		WebElement a2 = driver.findElement(By.xpath("//button[@onclick='onclick='jsPrompt()']"));
		a2.click();
		Alert a2 = driver.switchTo().alert();
		Thread.sleep(3000);
		a.sendKeys("Vaishali Kathole");
		//System.out.println(a.getText());
		a.accept();*/
		
		
		
		

	}

	private void accept() {
		// TODO Auto-generated method stub
		
	}

	private void sendKeys(String string) {
		// TODO Auto-generated method stub
		
	}

}
