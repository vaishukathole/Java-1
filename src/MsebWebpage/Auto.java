package MsebWebpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("WebDriver.chrome.driver" , "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("vaishali");
		
		

	}

}
