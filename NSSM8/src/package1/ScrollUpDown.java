package package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ScrollUpDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./exefiles/chromedriver.exe");
		WebDriver driver=new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.seleniumhq.org/");
		String jsCode1="window.scrollBy(0,1000)";
		JavascriptExecutor je=(JavascriptExecutor) driver;
		je.executeScript(jsCode1);
		Thread.sleep(2000);
		String jsCode2="window.scrollBy(0,-1000)";
		je.executeScript(jsCode2);
	}

}
