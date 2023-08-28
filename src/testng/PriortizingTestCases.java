package testng;

import org.testng.annotations.Test;

public class PriortizingTestCases {
	
	@Test(priority=1)
	public void tc1()
	{
		System.out.println("test case1");
	}
	@Test(priority=-1)
	public void tc2()
	{
		System.out.println("test case2");
	}
	@Test
	public void tc3()
	{
		System.out.println("test case3");
	}
	@Test(priority=3)
	public void tc4()
	{
		System.out.println("test case 4");
	}
	@Test
	public void tc5()
	{
		System.out.println("test case 5");
	}
	@Test(priority=-4)
	public void tc6()
	{
		System.out.println("test case 6");
	}
	@Test(priority=-3)
	public void tc7()
	{
		System.out.println("test case 7");
	}
}
