package package2;

import org.testng.annotations.DataProvider;

public class ConfigData {
	@DataProvider(name="politics")
	public Object[][] getData()
	{
	Object[][] obj=new Object[3][2];
	obj[0][0]="modi";
	obj[0][1]="Amit";
	obj[1][0]="Keju";
	obj[1][1]="Manish";
	obj[2][0]="papu";
	obj[2][1]="sidhu";
	
	
	return obj;
	}
	
}

