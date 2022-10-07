import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class p28_screenshot {
	static WebDriver driver;
	static int i=1;

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		takeScreenshot();
		driver.findElement(By.linkText("Register")).click();
		takeScreenshot();
		driver.findElement(By.id("FirstName")).sendKeys("abc");
		takeScreenshot();
		driver.findElement(By.id("LastName")).sendKeys("def");
		takeScreenshot();
	}
	static void takeScreenshot() throws IOException {
		File srcFile;
		srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(srcFile, new File("F:\\Selenium Demo\\" + i + ".jpeg"));
		i++;
	}

}
