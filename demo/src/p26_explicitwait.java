import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class p26_explicitwait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10,1));
		driver.findElement(By.linkText("Register")).click();
		WebElement fname = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("FirstName")));
		fname.sendKeys("vaibhav");
		driver.quit();

	}

}
