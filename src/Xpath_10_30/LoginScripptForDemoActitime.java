package Xpath_10_30;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/*
 * Scenario of login page:
 * Open the browser
 * Enter demo.actitime.com
 * Enter user name and password 
 * Click on login button
 * Verify home page
 * Close the browser
 */
public class LoginScripptForDemoActitime {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("manager");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		Thread.sleep(2000);
		String title=driver.getTitle();
		
		if(title.equals(title))
			System.out.println("Home page is displayed");
		else
			System.out.println("Home page is not displayed");
		
		Thread.sleep(2000);
		driver.quit();
	}

}
