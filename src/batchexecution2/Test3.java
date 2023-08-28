package batchexecution2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test3 {
	@Test
	public void tc1()
	{
		System.out.println("Test3-tc1");
	}
	@Test
	public void tc2()
	{
		System.out.println("Test3-tc2");
	}
	@Test
	public void tc3()
	{
		System.out.println("Test3-tc3");
		//Assert.fail();
	}
}
