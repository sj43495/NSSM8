package package2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ConfigMethod1 {
	WebDriver driver;
	@BeforeMethod
	public void preCondition()
	{
		System.out.println("Executing Before Method");
		System.setProperty("webdriver.chrome.driver", "./exefiles/chromedriver.exe");
		driver=new ChromeDriver();
		System.out.println("Chrome browser launced");
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/login.do;jsessionid=32hncnn98snpb");
		System.out.println("Navigated to the URL");
	}
	

}
