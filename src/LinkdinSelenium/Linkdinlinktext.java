package LinkdinSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkdinlinktext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("WebDriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.linkedin.com/");
		driver.findElement(By.linkText("People")).click();
		
		//driver.findElement(By.linkText("People")).click();
		
		driver.findElement(By.name("firstName")).sendKeys("vaishali");
		driver.findElement(By.name("lastName")).sendKeys("kathole");
		
		driver.findElement(By.linkText("Join now")).click();
		
		//Absulute_Xpath
		driver.findElement(By.xpath("/html/body/div[1]/main/div/form/section/div[2]/input")).sendKeys("vkathole2712");
		
		//Reletive_Xpath error
		
		//driver.findElement(By.xpath("//form[@class=\"join-form\"]/section/div[2]/div[2]/input")).sendKeys("12345678");
		
		
		//driver.findElement(By.xpath("/html/body/div[1]/main/div/form/section/div[2]/div[2]/input")).sendKeys("27121997");
		
		
		//Xpath
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("27121997");
		
		//driver.findElement(By.xpath("//*[containce(@class=\'third-party-join__gsi-btn-container\')]")
		

		driver.findElement(By.xpath("//*[text()='Continue with Google']")).click();
		

	}

}
