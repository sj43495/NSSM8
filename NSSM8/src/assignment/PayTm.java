package assignment;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class PayTm {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./exefiles/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.paytm.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='app']//div[text()='Log In/Sign Up']")).click();
		Thread.sleep(2000);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@src,'/v1/api/login?isIframe=true&theme=mp-web')]")));
		driver.findElement(By.xpath("//span[contains(text(),'Login/Signup with mobile number and password')]")).click();
		driver.findElement(By.name("username")).sendKeys("8130403048");
		driver.findElement(By.name("password")).sendKeys("sjena0000");
		
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[@title='Close']")).click();
		//driver.findElement(By.xpath("//span[contains(text(),'Login Securely')]")).click();
		System.out.println("done");
		
	}

}
