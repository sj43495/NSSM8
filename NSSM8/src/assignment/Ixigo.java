package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ixigo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./exefiles/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ixigo.com/");
		driver.findElement(By.xpath("//input[@placeholder='Return']")).click();
		driver.findElement(By.xpath("//div[@class='rd-month']/following-sibling::div//td[@data-date='30122018']/div[text()='30']")).click();
		
	}

}
