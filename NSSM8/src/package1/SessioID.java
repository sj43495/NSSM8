package package1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SessioID {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./exefiles/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/login.do;jsessionid=oatalwyo6af9");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.xpath("//span[text()='Help & Support']")).click();
		driver.findElement(By.xpath("//div[contains(text(),'User Guide')]")).click();
		Set<String> allSessions=driver.getWindowHandles();
		System.out.println(allSessions);
		System.out.println("All Session IDs :"+allSessions.size());
		Iterator<String> itr = allSessions.iterator();
		String parentID=itr.next();
		System.out.println(parentID);
		String childID=itr.next();
		System.out.println(childID);
		driver.switchTo().window(childID);
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Reporting Overview")).click();
		driver.quit();

	}

}
