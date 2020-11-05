package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	public WebDriver driver;
	
	
	public WebDriver initializeDriver() throws IOException 
	{
		Properties prop=new Properties();
		FileInputStream fis= new FileInputStream("C:\\Users\\44778\\eclipse-workspace\\Swaglabs\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		
		
		String browserName=prop.getProperty("browser");
		if( browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\chromedriver\\chromedriver.exe");
			 driver=new ChromeDriver();
		}
			
		else if (browserName.equals("firefox"))
		{
			//Gecko driver code to be inserted
		}
		
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	return driver;
		}
	}

