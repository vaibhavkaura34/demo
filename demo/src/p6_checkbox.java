import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p6_checkbox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		driver.findElement(By.linkText("Log in")).click();
		WebElement rememberme = driver.findElement(By.id("RememberMe"));
		boolean res= rememberme.isSelected();
		System.out.println(res);
		rememberme.click();
		driver.quit();


	}

}
