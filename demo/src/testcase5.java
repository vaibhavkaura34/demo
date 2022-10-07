import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcase5 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		driver.findElement(By.linkText("Register")).click();
		WebElement fname = driver.findElement(By.id("FirstName"));
		WebElement lname = driver.findElement(By.id("LastName"));
		String name = "vaibhav";
		fname.sendKeys(name);
		Thread.sleep(3000);
		lname.sendKeys("" + name.length());
		Thread.sleep(3000);
		driver.quit();
		
		
		
		

	}

}
