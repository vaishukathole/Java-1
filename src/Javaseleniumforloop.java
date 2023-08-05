import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javaseleniumforloop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty(" WebDriver.chrome.driver" , "chrome.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/#");
		
		
		/*driver.findElement(By.xpath("//*[@name='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		
		driver.findElement(By.xpath("(//a[@value='BOM'])")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//a[@value='JAI'])[2]")).click();
		
		Thread.sleep(1000);*/
		
		
		driver.findElement(By.xpath("//*[@id='divpaxinfo']")).click();
		
		Thread.sleep(2000);
		
		
		      int i = 1;   
 
		      while (i <5)    
		     
		      { driver.findElement(By.xpath("(//span[@id='hrefIncAdt'])[1]")).click( );
		      i++;
		 
		      Thread.sleep(1000);
		      }
		    
		      
		      int a = 0;   
		      
		      while (a <3)    
		     
		      { driver.findElement(By.xpath("(//span[@id='hrefIncChd'])[1]")).click( );
		      a++;
		 
		      Thread.sleep(1000);
		      }
		      

		      int b = 0;   
 
		      while (b <2)    
		     
		      {	driver.findElement(By.xpath("//span[@id='hrefIncInf']")).click();
		      
		      	b++;

		 
		      Thread.sleep(1000);
		      }
	
		
		

	}

}
