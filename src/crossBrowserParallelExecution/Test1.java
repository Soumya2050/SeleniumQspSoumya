package crossBrowserParallelExecution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Test1 extends BaseClass {
	@Test
	public void test1()
	{
		driver.get("https://www.swiggy.com/");
		WebElement logo=driver.findElement(By.xpath("//*[name()='svg']"));
		if(logo.isDisplayed())
		{
			System.out.println("The logo is displayed in Swiggy");
		}
		else {
			System.out.println("The logo is not displayed");
		}
	}
}
