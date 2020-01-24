package package2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EndToEndTest {
	WebDriver driver;
	@BeforeClass
	public void setUp()
	{
		System.out.println("Executing Before Class");
		System.setProperty("webdriver.chrome.driver", "./exefiles/chromedriver.exe");
		driver=new ChromeDriver();
		System.out.println("Chrome browser launced");
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/login.do;jsessionid=32hncnn98snpb");
	}
	@AfterClass
	public void tearDown()
	{
		System.out.println("Executing After Class");
		driver.close();
	}
	@BeforeMethod
	public void preCondition()
	{
		System.out.println("Executing Before Method");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
	}
	@AfterMethod
	public void postCondition()
	{
		System.out.println("Executing After Method");
		driver.findElement(By.id("logoutLink")).click();
	}
	@Test
	public void createNewCustomer()
	{
		System.out.println("Executing Create New Cstomer");
		driver.findElement(By.xpath("//a[contains(@href,'/tasks/otasklist.do')]")).click();
		driver.findElement(By.xpath("//a[text()='Projects & Customers']")).click();
		driver.findElement(By.xpath("//input[@value='Create New Customer']")).click();
		driver.findElement(By.name("name")).sendKeys("Oracle");
		driver.findElement(By.name("createCustomerSubmit")).click();
	}
	@Test(dependsOnMethods={"createNewCustomer"})
	public void CreateNewProject()
	{
		System.out.println("Executing Create New Project");
		driver.findElement(By.xpath("//a[contains(@href,'/tasks/otasklist.do')]")).click();
		driver.findElement(By.xpath("//a[text()='Projects & Customers']")).click();
		driver.findElement(By.xpath("//input[@value='Create New Project']")).click();
		WebElement custDrpDwn = driver.findElement(By.name("customerId"));
		Select sel=new Select(custDrpDwn);
		sel.selectByVisibleText("Oracle");
		driver.findElement(By.name("name")).sendKeys("Oracle Databae");
		driver.findElement(By.name("createProjectSubmit")).click();
	}
	@Test(dependsOnMethods={"CreateNewProject"})
	public void CreateTask()
	{
		System.out.println("Executing Create Task");
		driver.findElement(By.xpath("//a[contains(@href,'/tasks/otasklist.do')]")).click();
		driver.findElement(By.xpath("//input[@value='Create New Tasks']")).click();
		WebElement custDrpDown = driver.findElement(By.name("customerId"));
		Select sel1=new Select(custDrpDown);
		sel1.selectByVisibleText("Oracle");
		WebElement projDrpDwn = driver.findElement(By.name("projectId"));
		Select sel2=new Select(projDrpDwn);
		sel2.selectByVisibleText("Oracle Databae");
		driver.findElement(By.name("task[0].name")).sendKeys("America_WCE");
		driver.findElement(By.xpath("//input[@value='Create Tasks']")).click();
	}
}
