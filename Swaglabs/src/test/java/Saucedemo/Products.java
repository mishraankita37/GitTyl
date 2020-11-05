package Saucedemo;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobject.Landingpage;
import pageobject.Overview;
import pageobject.Yourcart;
import pageobject.Yourinformation;
import resources.Base;

public class Products extends Base  {
	
	@Test(dataProvider="getData")
	 public void sortPrice(String Firstname, String Lastname, String Postcode) throws IOException
	 {
		driver= initializeDriver();
		driver.get("https://www.saucedemo.com/inventory.html");
	Select s=new Select(driver.findElement(By.xpath("//*[@id=\"inventory_filter_container\"]/select")));
	s.selectByValue("lohi");
	Landingpage l= new Landingpage(driver);
	
    l.lowestPricelist().click();
    
    l.secondhighestPricelist().click();
    
    l.Cart().click();
    
    Yourcart y=new Yourcart(driver);
    y.Checkout().click();
    
    Yourinformation yi=new Yourinformation(driver);
    yi.inputFirstname().sendKeys(Firstname);
    yi.inputLastname().sendKeys(Lastname);
    yi.inputPostalcode().sendKeys(Postcode);
    yi.inputSubmitbutton().click();
    
    Overview o=new Overview(driver);
    o.FinishJourney().click();
	 }
	
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data= new Object[1][3];
		data[0][0]="Ankita";
		data[0][1]="Mishra";
		data[0][2]="RM3 9FF";
		
		return data;
	}


	
}
