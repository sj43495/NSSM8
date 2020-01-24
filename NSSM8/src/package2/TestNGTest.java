package package2;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestNGTest extends ConfigMethod{
	@Test(dataProvider="politics",dataProviderClass=ConfigData.class)
	public void dataTest(String politician1, String politician2)
	{
		System.out.println(politician1+" , "+politician2);
	}


}



/*@Test(dataProvider="politics",dataProviderClass=ConfigData.class)
public void dataTest(String ...politician1)
{
	System.out.println(politician1);
}
*/