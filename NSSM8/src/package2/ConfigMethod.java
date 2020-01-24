package package2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ConfigMethod {
	WebDriver driver;
	@BeforeMethod
	public void preCondition()
	{
		System.out.println("Executing Before Method");
	}
	@AfterMethod
	public void postCondition()
	{
		System.out.println("Executing After Method");
	}
}
