package demopageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class register {
	WebDriver driver;
	WebElement fname, lname, email, password, retype;
	register(WebDriver driver){
		this.driver= driver;
	}
	void enterFirstname(String s) {
		fname = driver.findElement(By.id("FirstName"));
		fname.sendKeys(s);
	}
	void enterLastname(String s) {
		fname = driver.findElement(By.id("LastName"));
		fname.sendKeys(s);
	}
	void enterEmail(String s) {
		email= driver.findElement(By.id("Email"));
		email.sendKeys(s);
	}

}
