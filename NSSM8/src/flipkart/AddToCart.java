package flipkart;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AddToCart {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./exefiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//input[@class='_2zrpKA']")).sendKeys("9700432260");
		driver.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv']")).sendKeys("sjena0000");
		driver.findElement(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']")).click();
		//String menXpath="(//span[@class='_1QZ6fC _3Lgyp8'])[3]";
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Men']")).click();
		driver.findElement(By.linkText("T-Shirts")).click();
		driver.findElement(By.xpath("//div[@class='_3O0U0u _288RSE']/div")).click();
		Set<String> wn = driver.getWindowHandles();
		
		
		
		/*Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath(menXpath))).perform();
		act.moveToElement(driver.findElement(By.linkText("T-Shirts"))).click().perform();*/
		
		
		
		
		
		
		
		//driver.close();

	}

}
