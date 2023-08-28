package crossBrowserParallelExecution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Test2 extends BaseClass{
	@Test
	public void test2() {
		driver.get("https://www.selenium.dev/");
		WebElement logo=driver.findElement(By.xpath("//*[name()='svg'][@id='Layer_1']"));
		
		if(logo.isDisplayed())
			System.out.println("selenium logo is displayed");
		else
			System.out.println("selenium logo is not displayed");
	}
}
