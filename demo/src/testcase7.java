import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class testcase7 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		driver.findElement(By.linkText("Books")).click();
		Select price = new Select(driver.findElement(By.id("products-orderby")));
		Thread.sleep(3000);
		price.selectByIndex(3);
		Thread.sleep(3000);
		driver.quit();

	}

}
