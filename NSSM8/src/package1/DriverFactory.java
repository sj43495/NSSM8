package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverFactory {
	static WebDriver driver;
	public static WebDriver getDriver(String browserName)
	{
		if(browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","./exefiles/chromedriver.exe");
			driver=new ChromeDriver();
			System.out.println("Chrome browser launced");
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","./exefiles/geckodriver.exe");
			driver=new FirefoxDriver();
			System.out.println("Firefox browser launced");
		}
		else if(browserName.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.driver","./exefiles/IEDriverServer.exe");
			driver=new InternetExplorerDriver();
			System.out.println("IE browser launced");
		}
		return driver;
	}

}
