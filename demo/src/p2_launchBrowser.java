import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class p2_launchBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("http://demowebshop.tricentis.com");
		String s;
		s=driver.getTitle();
		System.out.println(s);
		driver.quit();

	}

}
