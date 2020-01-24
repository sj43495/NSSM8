package package1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingMouseOperation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./exefiles/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.istqb.in");
		String foundationxp="//div[@id='tmMainMenu']//a[text()='FOUNDATION']";
		WebElement foundation=driver.findElement(By.xpath(foundationxp));
		Actions act=new Actions(driver);
		act.moveToElement(foundation).perform();
		String examDate="//div[@id='tmMainMenu']//a[contains(@href,'istqb-foundation/foundation-exam-dates')]";
		WebElement fondationExamDate=driver.findElement(By.xpath(examDate));
		act.click(fondationExamDate).perform();
		WebElement clickHere = driver.findElement(By.linkText("Click Here"));
		act.click(clickHere).perform();
		Set<String> allsessions=driver.getWindowHandles();
		System.out.println(allsessions);
		Iterator<String> itr = allsessions.iterator();
		String parentID = itr.next();
		System.out.println(parentID);
		String childID = itr.next();
		System.out.println(childID);
		driver.switchTo().window(childID);
		Thread.sleep(2000);
		WebElement emailTxtBx = driver.findElement(By.id("signin_password"));
		act.sendKeys(emailTxtBx, "kuchbhi").perform();
		
		
		
				
	}

}
