package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebOrders {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./exefiles/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
		driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();
		List<WebElement> rows=driver.findElements(By.xpath("//table[@class='SampleTable']//tr"));
		int rowCount=rows.size();
		String exp="//table[@class='SampleTable']//tr[1]/th";
		for(int i=1;i<=rowCount;i++)			
		{
			if(exp.equals("//table[@class='SampleTable']//tr["+i+"]/th"))
			{
				String expextedxp="//table[@class='SampleTable']//tr["+i+"]/th";
				List<WebElement> ncols=driver.findElements(By.xpath(expextedxp));
				int colCount=ncols.size();
				int newColCount=colCount-1;
				System.out.println(colCount);
				for(int j=1;j<newColCount;j++)
				{
					String ndata=ncols.get(j).getText();
					System.out.println(ndata);
					
				}
				
			}else{
				String xp="//table[@class='SampleTable']//tr["+i+"]/td";
				List<WebElement> cols=driver.findElements(By.xpath(xp));
				int DcolCount=cols.size();
				int DnewColCount=DcolCount-1;
				//System.out.println(colCount);
				for(int K=1;K<DnewColCount;K++)
				{
					String data=cols.get(K).getText();
					System.out.println(data);
					
				}
				
			}
			
		}driver.close();
	}
}
