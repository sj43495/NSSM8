package package3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./exefiles/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.out.println("Chrome browser launced");
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Santosh/Desktop/NSSM8.html");
		System.out.println("Navigated to the URL");
		
		driver.findElement(By.id("fileToUpload")).sendKeys("C:/Users/Santosh/Desktop/gfeSMO.jpg");
	}

}
