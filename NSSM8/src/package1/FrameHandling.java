package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./exefiles/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://seleniumhq.github.io/selenium/docs/api/java/");
		driver.switchTo().frame("packageListFrame");
		String xp="//ul//a[text()='com.thoughtworks.selenium']";
		driver.findElement(By.xpath(xp)).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("packageFrame");
		String xp2="//li//a[text()='DefaultSelenium']";
		driver.findElement(By.xpath(xp2)).click();
		driver.switchTo().defaultContent();
		WebElement frame1 = driver.findElement(By.xpath("//frame[@name='classFrame']"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.linkText("WebDriverBackedSelenium")).click();
		
	}

}
