package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Yourinformation {
	public WebDriver driver;
	public Yourinformation(WebDriver driver)
	{
      this.driver=driver;
	}


	By firstName = By.xpath("//*[@id=\"first-name\"]");
	By lastName = By.id("last-name");
	By postalCode = By.id("postal-code");
	By submitButton = By.cssSelector("input[type=submit]");
	
	public WebElement inputFirstname() {
		return driver.findElement(firstName);

	}

	public WebElement inputLastname() {
		return driver.findElement(lastName);
	}

	public WebElement inputPostalcode() {
		return driver.findElement(postalCode);

	}

	public WebElement inputSubmitbutton() {
		return driver.findElement(submitButton);
	}
}
