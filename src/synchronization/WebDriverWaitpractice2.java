package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/*
 * Scenario:
 * Open the browser
 * Enter the instagram.com
 * Check if login button is enable or not
 * Enter cardential
 * Re-check if login button is enable or not
 * Close the browser
 */
public class WebDriverWaitpractice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement loginButton=driver.findElement(By.xpath("//button[.='Log in']"));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		
		try
		{
			wait.until(ExpectedConditions.elementToBeClickable(loginButton)).click();
		}
		catch (Exception e)
		{
			System.out.println("Disabled");
		}
		
		driver.findElement(By.name("username")).sendKeys("soumya");
		driver.findElement(By.name("password")).sendKeys("ranjan");
		
		try
		{
			wait.until(ExpectedConditions.elementToBeClickable(loginButton)).click();
		}
		catch(Exception e)
		{
			System.out.println("Disabled");
		}
		
		driver.quit();
	}

}
