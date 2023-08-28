package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * Scenario of login page:
 * Open the browser
 * Enter demo.actitime.com
 * Enter user name and password 
 * Click on login button
 * Verify home page
 * Close the browser
 */
public class CssSelectorPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.cssSelector("input#username")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input.pwdfield")).sendKeys("manager");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[id='loginButton']")).click();
		Thread.sleep(2000);
		if(driver.getTitle().contains("Time-Track"))
		
			System.out.println("Pass");
		
		else
		
			System.out.println("Fail");
		
		Thread.sleep(2000);
		driver.quit();
	}

}
