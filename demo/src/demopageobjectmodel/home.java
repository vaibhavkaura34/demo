package demopageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class home {
	WebDriver driver;
	WebElement login, register;
	home(WebDriver driver){
		this.driver = driver;
	}
	void clickRegister() {
		register = driver.findElement(By.linkText("Register"));
		register.click();
	}
	void clickLogin() {
		login = driver.findElement(By.linkText("Log in"));
		login.click();
	}

}
