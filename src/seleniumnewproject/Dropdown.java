package seleniumnewproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chorme.driver", "ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//WebElement checkbox = driver.findElement(By.xpath("//*[@id='dropdown-class-example']"));
		
		//Select s = new Select (dropdown);
		//s.selectByIndex(1);:
		
		
		
		
		//driver.get("https://www.mahadiscom.in/solar-mskvy/gr.php");
		
		//WebElement dropdown = driver.findElement(By.xpath("//*[@id=\'grDropdown\']"));
		//Select s = new Select (dropdown);
		//s.selectByIndex(0);
		
		//System.out.println(s.getFirstSelectedOption().getText());
		//s.selectByValue("option2");
		//System.out.println(s.getFirstSelectedOption().getText());
		
		
		//s.selectByVisibleText("option3");
		//System.out.println(s.getFirstSelectedOption().getText());
		
		WebElement checkbox = driver.findElement(By.id("checkBoxOption1"));
		
		 checkbox.isSelected();
		 
			System.out.println(checkbox.isSelected());
			
			checkbox.click();
			
			checkbox.isSelected();
			 
			System.out.println(checkbox.isSelected());
			
			
		
		
		
		
		
	}

}
