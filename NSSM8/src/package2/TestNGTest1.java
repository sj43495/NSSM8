package package2;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestNGTest1 extends ConfigMethod1{
	@Test(priority=1,groups={"Smoke","Regression"},dataProviderClass=ConfigMethod1.class)
	public void validLogin()
	{
		System.out.println("validLogin");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
	}
	@Test(priority=2,groups={"Functional","Regression"},dataProviderClass=ConfigMethod1.class)
	public void invalidLogin()
	{
		System.out.println("invalidLogin");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("1234");
		driver.findElement(By.id("loginButton")).click();
	}
	@Test(priority=3,groups={"System","Regression"},dataProviderClass=ConfigMethod1.class)
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
