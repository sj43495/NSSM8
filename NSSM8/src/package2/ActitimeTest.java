package package2;

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
		System.out.println("Executing Before Method");
		System.setProperty("webdriver.chrome.driver", "./exefiles/chromedriver.exe");
		driver=new ChromeDriver();
		System.out.println("Chrome browser launced");
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/login.do;jsessionid=32hncnn98snpb");
		System.out.println("Navigated to the URL");
	}
	@AfterMethod
	public void postCondition()
	{
		System.out.println("Executing After Method");
		driver.close();
		System.out.println("Browser Closed");
		
	}
	@Test(priority=1)
	public void validLogin()
	{
		System.out.println("validLogin");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
	}
	@Test(priority=2)
	public void invalidLogin()
	{
		System.out.println("invalidLogin");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("1234");
		driver.findElement(By.id("loginButton")).click();
	}
	@Test(priority=3)
	public void createNewCustomer()
	{
		System.out.println("createNewCustomer");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.xpath("//a[contains(@href,'/tasks/otasklist.do')]")).click();
		driver.findElement(By.xpath("//a[text()='Projects & Customers']")).click();
		driver.findElement(By.xpath("//input[@value='Create New Customer']")).click();
		driver.findElement(By.name("name")).sendKeys("Niraj");
		driver.findElement(By.name("createCustomerSubmit")).click();
		System.out.println("New Customer created");
		
		
	}

}
