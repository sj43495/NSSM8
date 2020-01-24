package assignment;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebOrdersUsingScanner {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./exefiles/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
		driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();
		Scanner scn =new Scanner(System.in);
		System.out.println("Enter a Name  :");
		String expName=scn.nextLine();
		String rowXP="//table[@class='SampleTable']//tr";
		List<WebElement> rows=driver.findElements(By.xpath(rowXP));
		for(int i=2;i<=rows.size();i++)
		{
			String secondColXP="//table[@class='SampleTable']//tr["+i+"]/td[2]";
			String actName=driver.findElement(By.xpath(secondColXP)).getText();
			if(actName.equals(expName))
			{
				String colsXP="//table[@class='SampleTable']//tr["+i+"]/td";
				List<WebElement> cols=driver.findElements(By.xpath(colsXP));
				for(int j=1;j<cols.size();j++)
				{
					String data=cols.get(j).getText();
					System.out.println(data);
				}
			}
		}
	driver.close();	
	}
	
	//String s="//table[@class='SampleTable']//tr/td[2]";

}
