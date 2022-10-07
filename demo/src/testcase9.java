import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcase9 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		driver.findElement(By.linkText("Register")).click();
		WebElement firstname = driver.findElement(By.id("FirstName"));
		firstname.sendKeys("vaibhav");
		int count = firstname.getAttribute("value").length();
		System.out.println(count);
		Thread.sleep(3000);
		driver.quit();
	}

}
