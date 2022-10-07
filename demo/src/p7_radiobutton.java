import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p7_radiobutton {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		driver.findElement(By.linkText("Register")).click();
		WebElement male = driver.findElement(By.id("gender-male"));
		male.click();
		Thread.sleep(5000);
		WebElement female = driver.findElement(By.id("gender-female"));
		female.click();
		Thread.sleep(5000);
		driver.quit();

	}

}
