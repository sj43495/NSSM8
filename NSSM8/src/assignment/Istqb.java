package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Istqb {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./exefiles/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.istqb.in");
		WebElement twb= driver.findElement(By.xpath("//div[@class='uk-visible-large uk-navbar-flip']//a[text()='FOUNDATION']"));
		Actions act=new Actions(driver);
		act.moveToElement(twb);
		act.perform();
		driver.findElement(By.linkText("EXAM DATES")).click();
	}

}
