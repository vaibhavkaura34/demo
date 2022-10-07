import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcase1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		driver.findElement(By.linkText("Register")).click();
		WebElement fname = driver.findElement(By.id("FirstName"));
		WebElement lname = driver.findElement(By.id("LastName"));
		fname.sendKeys("vaibhav");
		fname.sendKeys(Keys.CONTROL, "a");
		fname.sendKeys(Keys.CONTROL, "c");
		lname.sendKeys(Keys.CONTROL, "v");
		Thread.sleep(5000);
		driver.quit();
		
		

	}

}
