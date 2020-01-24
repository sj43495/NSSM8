package toolsqa;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChckBxRadioBtn {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./exefiles/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-form");
		List<WebElement> rdBtn_Sex = driver.findElements(By.name("sex"));
		
		boolean bValue=false;
		bValue=rdBtn_Sex.get(0).isSelected();
		if(bValue==true)
		{
			rdBtn_Sex.get(1).click();
		}
		else
		{
			rdBtn_Sex.get(0).click();
		}
		

	}

}
