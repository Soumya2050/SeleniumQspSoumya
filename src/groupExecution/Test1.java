package groupExecution;

import org.testng.annotations.Test;

public class Test1 {
	
	@Test(groups="smoke")
	public void tc1()
	{
		System.out.println("Test1-tc1");
	}
	@Test(groups="sanity")
	public void tc2()
	{
		System.out.println("Test1-tc2");
	}
	@Test(groups="regression")
	public void tc3()
	{
		System.out.println("Test1-tc3");
	}
}
