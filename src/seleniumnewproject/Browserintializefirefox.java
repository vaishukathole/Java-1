package seleniumnewproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Browserintializefirefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.geco.driver", "gecodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");

	}

}
