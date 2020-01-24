package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithWebElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./exefiles/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://wwww.facebook.com");
		driver.findElement(By.id("email")).sendKeys("santoshjena.don@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("sjena9853111067");
		driver.findElement(By.id("u_0_2")).submit();
		
		
		
		
		driver.close();
	}

}
