package driver_actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driverfactory {

	public WebDriver driver;
	public static ThreadLocal<WebDriver>tlDriver=new ThreadLocal<>();
	 /**
	  * This method is used ti initialise the driver
	  *  browser
	  * @return will return tldriver
	  */
	public  WebDriver init_driver(String browser)
	{
		System.out.println("browser value :is" +browser);
		
		if(browser.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			tlDriver.set(new ChromeDriver());			
		}
		else if(browser.equals("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			tlDriver.set(new FirefoxDriver());	
		}
		else if(browser.equals("safari"))
		{
			tlDriver.set(new SafariDriver());
		}
		else
		{
			System.out.println("Please pass correct browser value:"+browser);
		}
		getDriver().manage().deleteAllCookies();
		getDriver().manage().window().maximize();
		return getDriver();
	}
	public static synchronized WebDriver getDriver()
	{
		return tlDriver.get();

}
	
}
