package package3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ActitimeTest {
	WebDriver driver;
	@BeforeMethod
	public void preCondition()
	{
		System.setProperty("webdriver.chrome.driver", "./exefiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://127.0.0.1/login.do;jsessionid=32hncnn98snpb");
	}
	@Test(priority=1)
	public void validLogin()
	{
		LoginPage lp=new LoginPage(driver);
		lp.getUnTxtBx().sendKeys("admin");
		lp.getPwdTxtBx().sendKeys("manager");
		lp.getChkBx().click();
		lp.getLoginBtn().click();
	}
	@Test(priority=2)
	public void invalidLogin()
	{
		LoginPage lp=new LoginPage(driver);
		lp.getUnTxtBx().sendKeys("admin");
		lp.getPwdTxtBx().sendKeys("manager");
		lp.getLoginBtn().click();

	}

}
