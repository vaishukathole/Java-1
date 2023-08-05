import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MahadsebAoutomet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("WebDriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.mahadiscom.in/en/home/");
		
		
		
		
	}

}
