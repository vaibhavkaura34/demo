import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p3_launchBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		WebElement register = driver.findElement(By.linkText("Register"));
		register.click();
		String s;
		s=driver.getTitle();
		System.out.println(s);
		driver.quit();

	}

}
