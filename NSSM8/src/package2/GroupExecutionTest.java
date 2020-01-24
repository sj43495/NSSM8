package package2;

import org.testng.annotations.Test;

public class GroupExecutionTest {
	@Test(groups={"Smoke","Regression"})
	public void validLogin()
	{
		System.out.println("Valid Login");
	}
	@Test(groups={"Functional"})
	public void ivalidLogin()
	{
		System.out.println("InValid Login");
	}
	@Test(groups={"Smoke"})
	public void createCustomer()
	{
		System.out.println("Create Customer");
	}
	@Test(groups={"Integration","Regression"})
	public void createCustProj()
	{
		System.out.println("Create Customer + Create Project");
	}
	@Test(groups={"System","Regression"})
	public void createCustProjTask()
	{
		System.out.println("Create Customer, Project and Task");
	}
	/*@Test
	public void validLogin()
	{
		System.out.println("");
	}*/

}
