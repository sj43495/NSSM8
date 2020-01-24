package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dhoni {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./exefiles/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("dhoni");
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//b[text()=' movie']")));
		System.out.println("Present");
		driver.findElement(By.xpath("//span[text()='dhoni']")).click();
		String dob=driver.findElement(By.xpath("//span[starts-with(text(),'7 July')]")).getText();
		System.out.println(dob);
		
		//String firstLink =elements.get(0).getText();
		//System.out.println(firstLink);
		//driver.navigate().to(firstLink);
		
		
		
		//driver.findElement(By.xpath("//b[text()='dhoni']")).click();
	}

}
