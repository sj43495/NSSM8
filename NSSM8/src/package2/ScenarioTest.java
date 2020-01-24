package package2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ScenarioTest {
	WebDriver driver;
	@BeforeClass
	public void preCondition()
	{
		System.out.println("Executing Before Class");
		System.setProperty("webdriver.chrome.driver", "./exefiles/chromedriver.exe");
		driver=new ChromeDriver();
		System.out.println("Chrome browser launced");
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/login.do;jsessionid=32hncnn98snpb");
		System.out.println("Navigated to the URL");
		System.out.println("Navigated to URL");	
	}
	@AfterClass
	public void postCondtion()
	{
		System.out.println("Executing After Class");
		driver.close();
		System.out.println("Browser Closed");	
	}
	@Test
	public void createNewCustomer()
	{
		System.out.println("createNewCustomer");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.xpath("//div[text()='Users']")).click();
		driver.findElement(By.xpath("//span[text()='Create New User']")).click();
		driver.findElement(By.name("username")).sendKeys("Niraj");
		driver.findElement(By.name("passwordText")).sendKeys("jadu");
		driver.findElement(By.name("passwordTextRetype")).sendKeys("jadu");
		driver.findElement(By.name("firstName")).sendKeys("Niraj");
		driver.findElement(By.name("lastName")).sendKeys("Kumar");
		driver.findElement(By.name("email")).sendKeys("niraj2@jadu.com");
		driver.findElement(By.cssSelector("input[value*='Create User']")).click();
		driver.findElement(By.id("logoutLink")).click();
	}
	@Test
	public void loginAsNewUser()
	{
		System.out.println("loginAsNewUser");
		driver.findElement(By.name("username")).sendKeys("Niraj");
		driver.findElement(By.name("pwd")).sendKeys("jadu");
		driver.findElement(By.id("loginButton")).click();
	}
	@Test
	public void deleteNewUser()
	{
		System.err.println("deleteNewUser");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.xpath("//div[text()='Users']")).click();
		driver.findElement(By.xpath("//a[text()='Kumar, Niraj (Niraj)']")).click();
		driver.findElement(By.xpath("//input[@value='Delete This User']")).click();
		String expectedMsg="Are you sure you want to delete this user account?";
		Alert alt=driver.switchTo().alert();
		if(expectedMsg.equals(alt.getText()))
		{
			System.out.println("Alert msg is verified");
		}else{
			System.out.println("Alert msg is not verified");
		}
		alt.accept();
		driver.findElement(By.id("logoutLink")).click();
		
	}

}
