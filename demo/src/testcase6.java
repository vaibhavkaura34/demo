import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcase6 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		String s = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[1]/a/img")).getAttribute("src");
		System.out.println(s);
		driver.quit();

	}

}
