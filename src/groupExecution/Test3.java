package groupExecution;

import org.testng.annotations.Test;

public class Test3 {
	@Test(alwaysRun=true)
	public void tc1()
	{
		System.out.println("Test3-tc1");
	}
	@Test(groups={"smoke","sanity"})
	public void tc2()
	{
		System.out.println("Test3-tc2");
	}
	@Test(groups= {"smoke","sanity","regression"})
	public void tc3()
	{
		System.out.println("Test3-tc3");
	}
}
