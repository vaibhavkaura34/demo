package demopageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tc1_registerUser {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		home home = new home(driver);
		home.clickRegister();
		register register = new register(driver);
		register.enterFirstname("abc");
		register.enterLastname("def");
		register.enterEmail("test1@gmail.com");
		Thread.sleep(3000);
		driver.quit();
		

	}

}
