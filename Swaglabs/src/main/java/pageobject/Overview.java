package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Overview {

	
	public WebDriver driver;
	public Overview(WebDriver driver)
	{
      this.driver=driver;
	}

	By finish = By.xpath("//a[contains(@class,'cart_button')]");
	
	public WebElement FinishJourney() {
		return driver.findElement(finish);

	}
	
}
