import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class p8_listBox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		driver.findElement(By.linkText("Digital downloads")).click();
		Select price = new Select(driver.findElement(By.id("products-orderby")));
		price.selectByVisibleText("Price: Low to High");
		int total = price.getOptions().size();
		System.out.println("Total items "+ total);
		Thread.sleep(5000);
		driver.quit();
		

	}

}
