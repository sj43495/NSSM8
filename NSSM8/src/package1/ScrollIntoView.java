package package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollIntoView {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./exefiles/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.seleniumhq.org/");
		String jsCode="arguments[0].scrollIntoView(true)";
		String css="img[src*='Subject7_logo.png']";
		JavascriptExecutor je=(JavascriptExecutor)driver;
		je.executeScript(jsCode, driver.findElement(By.cssSelector(css)));
		
		
		
		
	}

}
