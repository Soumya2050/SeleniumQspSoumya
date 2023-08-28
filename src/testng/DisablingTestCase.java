package testng;

import org.testng.annotations.Test;

public class DisablingTestCase {
	
	@Test(enabled = false)
	public void tc1()
	{
		System.out.println("test case1");
	}
	@Test()
	public void tc2()
	{
		System.out.println("test case2");
	}
	@Test()
	public void tc3()
	{
		System.out.println("test case3");
	}
	@Test(enabled=false)
	public void tc4()
	{
		System.out.println("test case 4");
	}
	
}
