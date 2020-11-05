package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class Landingpage {
         WebDriver driver;
         
	public Landingpage(WebDriver driver)
	{
      this.driver=driver;
	}
	
 
	//By priceDropdown = By.xpath("//*[@id=\\\"inventory_filter_container\\\"]/select");
	By lowestPrice=By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[3]/button");
	By secondHighestprice = By.xpath("//*[@id=\"inventory_container\"]/div/div[5]/div[3]/button");
	By shoppingCart =By.xpath("//a[contains(@class,'shopping_cart')]");


	/*public WebElement Dropdowns() {
		return driver.findElement(priceDropdown)

	}*/

	public WebElement lowestPricelist() {
		return driver.findElement(lowestPrice);
	}

	public WebElement secondhighestPricelist() {
		return driver.findElement(secondHighestprice);

	}

	public WebElement Cart() {
		return driver.findElement(shoppingCart);
	}

}
