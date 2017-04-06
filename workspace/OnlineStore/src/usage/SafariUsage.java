package usage;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;
 
public class SafariUsage {
 
	public static void main(String[] args)
	{
		WebDriver driver = new SafariDriver();
		driver.get("http://store.demoqa.com");
 
		//Find some element on DemoQa.com
		WebElement element = driver.findElement(By.id("login"));
		element.click();
 
	}
 
}
