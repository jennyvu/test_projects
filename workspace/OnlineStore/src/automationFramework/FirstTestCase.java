package automationFramework;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTestCase {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "/Users/jennyvo/DownLoads/geckodriver");
		
		driver = new FirefoxDriver();
		
		driver.get("http://www.google.com");
		
		// Print a Log In message to the screen
        System.out.println("Successfully opened the website www.Store.Demoqa.com");
 
		//Wait for 5 Sec
		Thread.sleep(5);
		
        // Close the driver
        driver.quit();
	}

}
