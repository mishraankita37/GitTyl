package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Yourcart {

	public WebDriver driver;
	public Yourcart(WebDriver driver)
	{
      this.driver=driver;
	}

	By checkout = By.xpath("//a[contains(@class,'checkout')]");
	
	public WebElement Checkout() {
		return driver.findElement(checkout);

	}

	
}
