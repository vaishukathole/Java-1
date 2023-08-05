package OmeyoSite;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Omayo_practice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://omayo.blogspot.com/2013/05/page-one.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));
		
		WebElement al = driver.findElement(By.xpath("//input[@id='alert1']"));
		al.click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
		WebElement al2 = driver.findElement(By.xpath("//input[@id='prompt']"));
		al2.click();
		Alert a =  driver.switchTo().alert();
		
		System.out.println(a.getText());
		a.sendKeys("Vaishali");
		Thread.sleep(2000);
		a.accept();
				
		WebElement al1 = driver.findElement(By.xpath("//input[@id='confirm']"));
		al1.click();
		driver.switchTo().alert().dismiss();

	}

}
