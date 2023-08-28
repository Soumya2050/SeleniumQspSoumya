package testng;

import org.testng.annotations.Test;

public class InvocationCountTest {
	
	@Test(invocationCount=3)
	public void tc1()
	{
		System.out.println("test case1");
	}
	@Test(invocationCount=-1)
	public void tc2()
	{
		System.out.println("test case2");
	}
	@Test(invocationCount=-1)
	public void tc3()
	{
		System.out.println("test case3");
	}
	@Test(invocationCount=3)
	public void tc4()
	{
		System.out.println("test case 4");
	}
	@Test(invocationCount=0)
	public void tc5()
	{
		System.out.println("test case 5");
	}
	@Test(invocationCount=-4)
	public void tc6()
	{
		System.out.println("test case 6");
	}
	@Test(invocationCount=1)
	public void tc7()
	{
		System.out.println("test case 7");
	}
}
