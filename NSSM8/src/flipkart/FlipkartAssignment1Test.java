package flipkart;

import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class FlipkartAssignment1Test {
	WebDriver driver;
	@BeforeMethod
	public void preCondition()
	{
		System.out.println("Executing Before Method");
		//System.setProperty("webdriver.chrome.driver", "./exefiles/chromedriver.exe");
		//driver=new ChromeDriver();
		driver=new RemoteWebDriver(DesiredCapabilities.internetExplorer());
		System.out.println("Chrome browser launced");
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		System.out.println("Navigated to the URL");
	}
	@AfterMethod//(enabled=false)
	public void postCondition()
	{
		System.out.println("Executing After Method");
		driver.close();
		System.out.println("Browser Closed");
	}
	@Test(description="Executing Script")
	public void verifyFlipkart() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@class='_2zrpKA']")).sendKeys("9700432260");
		driver.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv']")).sendKeys("sjena0000");
		driver.findElement(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='container']//input[contains(@placeholder,'Search for products')]")).sendKeys("samsung galaxy");
		driver.findElement(By.className("vh79eN")).submit();
		Thread.sleep(2000);
		String s = driver.findElement(By.xpath("//span[contains(text(),'Showing')]")).getText();
		System.out.println(s);
		String s1 = s.substring(41,55);
		System.out.println(s1);
/********************Converting String40 to Integer 40**************/ 
		String s2 = s.substring(12,14);
		int number=Integer.parseInt(s2);
		System.out.println("Converted String to iteger "+number);
/*************Verifying all the name ********************************/
		String colXP="//div[@class='_1HmYoV hCUpcT']/div[2]/div[2]/div/div";
		List<WebElement> cols=driver.findElements(By.xpath(colXP));
		
		String rowXP="//div[@class='_1HmYoV hCUpcT']/div[2]/div";
		List<WebElement> rows=driver.findElements(By.xpath(rowXP));
		
		SoftAssert sa=new SoftAssert();
		for(int i=2;i<=rows.size()-1;i++)
		{
			for(int j=1;j<=cols.size();j++)
			{
				
				String text = driver.findElement(By.xpath("//div[@class='_1HmYoV hCUpcT']/div[2]/div["+i+"]/div/div["+j+"]//a[2]")).getText();
				System.out.println(text);
				/*try{
					sa.assertTrue(text.toLowerCase().contains(s1));
			        }catch(AssertionError e)
			        {
			            System.out.println("Assertion error. ");
			        }*/
				sa.assertTrue(text.toLowerCase().contains(s1));
				/*System.out.println(text+" contains  "+s1);
				
				sa.assertFalse(text.toLowerCase().contains(s1));
				System.out.println(text+" does not contain "+s1);*/
				
			}
		}
		sa.assertAll();	
	}
	
}
