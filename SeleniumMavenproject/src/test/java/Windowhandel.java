

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windowhandel {

	private static Object OutputTypeFILE;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		
		driver.findElement(By.xpath("//*[@placeholder='First Name']")).sendKeys("Vaishali");
		
		driver.findElement(By.xpath("//*[@placeholder='Last Name']")).sendKeys("Kathole");
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(source, new File("C://Screenshot.//s1.png"));
		
		
	}

}
