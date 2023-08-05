package MsebWebpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homepage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
System.setProperty("WebDriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.mahadiscom.in/en/home/");
		 //driver.findElement(By.className("class=\"menu-link main-menu-link\"")).click();
		//driver.findElement(By.linkText(("Close"))).click();
		
		 driver.findElement(By.xpath("//*[text()='Close']")).click();
		
		 driver.findElement(By.xpath("/html/body/header/nav/div/div[2]/ul/li[2]/a")).click();
		 driver.findElement(By.xpath("//a[@class='menu-link sub-menu-link'][1]")).click();
		 
		 driver.findElement(By.xpath("/html/body/header/nav/div/div[2]/ul/li[2]/a")).click();
		 
		 driver.findElement(By.xpath("/html/body/header/nav/div/div[2]/ul/li[2]/ul/li[2]/a")).click();
		 driver.findElement(By.xpath("/html/body/header/nav/div/div[2]/ul/li[2]/a")).click();
		 driver.findElement(By.xpath("//*[text()='Vision & Mission']")).click();
		 
		 driver.findElement(By.xpath("/html/body/header/nav/div/div[2]/ul/li[2]/a")).click();
		 
		 driver.findElement(By.xpath("//*[text()='Executive Engineer Team']")).click();  
		 
		 driver.findElement(By.xpath("//*[contains(@for,'nagpur_region')]")).click();
		 
		// driver.findElement(By.xpath("//*[@class='accordion_tab_label zone' or @for='akola_zn']")).click();
		 
		 driver.findElement(By.xpath("//*[contains(@for,'akola_zn')]")).click();
		 
		 driver.findElement(By.xpath("/html/body/header/nav/div/div[2]/ul/li[2]/a")).click();
		 
		driver.findElement(By.linkText(("Achievements & Testimonials"))).click();
		driver.findElement(By.linkText(("Achievements"))).click();
		
		//driver.findElement(By.linkText(("Achievements & Testimonials"))).click();
		//driver.findElement(By.linkText(("Testimonials & Awards"))).click();
		//driver.findElement(By.linkText(("Awards"))).click();
		//driver.findElement(By.linkText(("Testimonials & Awards"))).click();
		//driver.findElement(By.linkText(("Testimonials"))).click();
		 
		driver.findElement(By.linkText("Home")).click();
		
		driver.findElement(By.name("A")).sendKeys("123456");
		 
		 
		 
		 
		 
		 
	}

}
