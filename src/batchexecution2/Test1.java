package batchexecution2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 {
	
	@Test
	public void tc1()
	{
		System.out.println("Test1-tc1");
	}
	@Test
	public void tc2()
	{
		System.out.println("Test1-tc2");
		//Assert.fail();
	}
	@Test
	public void tc3()
	{
		System.out.println("Test1-tc3");
	}
}
