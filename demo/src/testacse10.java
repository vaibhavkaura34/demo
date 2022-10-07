import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testacse10 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		for(int i=0;i<5;i++) {
			driver.findElement(By.xpath("//a[@class='ico-register']")).click();
				Thread.sleep(3000);
			
				
		}
		Thread.sleep(3000);
		driver.quit();

	}

}
