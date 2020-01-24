package assignment;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HdfcBank {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./exefiles/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.hdfcbank.com/");
		driver.findElement(By.id("loginsubmit")).click();
		Set<String> allSessions = driver.getWindowHandles();
		System.out.println(allSessions);
		Iterator<String> itr=allSessions.iterator();
		String parentID=itr.next();
		String childID=itr.next();
		driver.switchTo().window(childID);
		driver.findElement(By.xpath("//div[@class='container']/div/a[text()='Continue to NetBanking']")).click();
		driver.switchTo().frame("login_page");
		driver.findElement(By.xpath("//tbody//td/span/input")).sendKeys("jena1234");
		driver.findElement(By.xpath("//img[@alt='continue']")).click();
	}

}
