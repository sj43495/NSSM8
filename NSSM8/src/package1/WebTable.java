package package1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./exefiles/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Santosh/Desktop/NSSM8.html");
		List<WebElement> rows=driver.findElements(By.xpath("//table[@name='Num']//tr"));
		int rowsCount=rows.size();
		//System.out.println(rowsCount);
		int sum=0;
		for(int i=1;i<=rowsCount;i++)
		{
			String xp="//table[@name='Num']//tr["+i+"]/td";
			List<WebElement> cols=driver.findElements(By.xpath(xp));
			int colCount=cols.size();
			//System.out.println(colCount);
			System.out.println("Row: "+i+"columns: "+colCount);
			for(int j=0;j<colCount;j++)
			{
				String data=cols.get(j).getText();
				System.out.println(data);
				int k=Integer.parseInt(data);
				if(k%2==0){
				sum=sum+k;
				}
				
			}
			System.out.println("*********");
		}
		System.out.println("Total Sum"+sum);
	}
	

}
