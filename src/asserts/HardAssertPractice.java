package asserts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertPractice {
	@Test
	public void demo()
	{
		String s1="hii";
		String s2="hello";
		
		Assert.assertEquals(s1, s2);
			System.out.println("pass");
			System.out.println("fail");
			
	}
			
}
