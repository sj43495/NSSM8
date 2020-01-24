package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Irctc {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./exefiles/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.findElement(By.xpath("//span[text()='ui-btn']/../span")).click();
		driver.findElement(By.xpath("//span[text()='ui-btn']/../following-sibling::div/div/a[2]/span")).click();
		driver.findElement(By.xpath("//tbody/tr[2]/td[3]")).click();
	}

}

