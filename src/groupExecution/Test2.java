package groupExecution;

import org.testng.annotations.Test;


public class Test2 {
	@Test(groups={"smoke","sanity"})
	public void tc1()
	{
		System.out.println("Test2-tc1");
	}
	@Test(groups={"smoke","regression"})
	public void tc2()
	{
		System.out.println("Test2-tc2");
	}
	@Test(groups={"sanity","regression"})
	public void tc3()
	{
		System.out.println("Test2-tc3");
	}
}
