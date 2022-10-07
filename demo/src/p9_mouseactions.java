import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class p9_mouseactions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		WebElement electronics = driver.findElement(By.linkText("ELECTRONICS"));
		Actions actions = new Actions(driver);
		actions.moveToElement(electronics).build().perform();
		WebElement cellphones = driver.findElement(By.linkText("Cell phones"));
		Thread.sleep(3000);
		cellphones.click();
		Thread.sleep(3000);
		driver.quit();
		

	}

}
