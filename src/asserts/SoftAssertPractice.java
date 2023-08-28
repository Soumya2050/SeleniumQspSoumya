package asserts;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertPractice {
	@Test
	public void demo()
	{
		String s1="hii";
		String s2="hello";
		
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(s1, s2);
			System.out.println("pass");
			System.out.println("fail");
			
	}
}
