import org.openqa.selen00ium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajiocom {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		/*System.setProperty("webdriver.chorme.driver", "ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com");
		
		Thread.sleep(1000);
		
		WebElement searchbox = driver .findElement(By.xpath("//input[@role='combobox']"));
		
		//String a = searchbox.getAttribute("class");
		
		//System.out.println("Attribute is" +a);
		
		//searchbox.sendKeys("saree");
		
		boolean b = KIDS.isEnabled();*/
		
		System.setProperty("WebDriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/#");
		
		
		        for(int i=0; i<=5; i+=1)                                                            
		driver.findElement(By.xpath("//*[@id='divpaxinfo']")).click();
		Thread.sleep(2000);
		
       /* for(int i=0; i<=5; i+=1)
        {
            
        
        System.out.println(i+" ");
        
        }*/
        
        
		

	}

}
