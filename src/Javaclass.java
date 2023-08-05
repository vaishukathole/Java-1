import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Javaclass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("WebDriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/#");
		
		/*driver.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		
		driver.findElement(By.xpath("//a[@value='PNQ']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//a[@value='COK'])[2]")).click();
		
		Thread.sleep(2000);*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		driver.findElement(By.xpath("//*[@id='divpaxinfo']")).click();
		
		Thread.sleep(2000);
	
	
		for (int i = 1; i <6; i++) {
	          
	           driver.findElement(By.id("hrefIncAdt")).click();
	           
	          //System.out.println(i);
	          
	           Thread.sleep(1000);
	           }
		  	
		
		for (int i = 0; i < 3; i++) {
	          
	           driver.findElement(By.id("hrefIncChd")).click();
	          
	           Thread.sleep(1000);
	           }
		  	

		for (int i = 0; i < 2; i++) {
			driver.findElement(By.xpath("//*[@id='hrefIncInf']")).click();
	          
	           //driver.findElement(By.id("hrefIncInf")).click();
	          
	           Thread.sleep(1000);
	           
	           
	           }
		
		driver.findElement(By.xpath("//*[@id='btnclosepaxoption']")).click();
		
		 Thread.sleep(1000);
		 
		 
		WebElement dropdown = driver.findElement(By.xpath("//*[@id='ctl00_mainContent_DropDownListCurrency']"));
		
				Select s = new Select (dropdown);
				s.selectByIndex(2);
				
				//WebElement checkbox = driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily"));
				
				 //checkbox.isSelected();
				 
					//System.out.println(checkbox.isSelected());
					
					//checkbox.click();
					
					//checkbox.isSelected();
					 
					//System.out.println(checkbox.isSelected());
					
					WebElement checkbox = driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount"));
					
					checkbox.click();
				
				
		
				
				
		
			
		
	
		
		
		
		
	   
		

		
		
		
		
		
		
		
		
	

	}

}
