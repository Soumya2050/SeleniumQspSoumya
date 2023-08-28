package framesAndwindows;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

/*
 * Scenario:
 * Open the browser
 * Enter snapdeal.com
 * Mousehover to sign in
 * Click on login button
 * Enter mobile number
 * cose the frame
 * type watches on seacrh text field 
 * click on search
 * close the broswer 
 */
public class FramesSnapdealPractice1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement signin =driver.findElement(By.className("accountUserName"));
		Actions a=new Actions(driver);
		a.moveToElement(signin).perform();
		
		driver.findElement(By.xpath("//a[text()='login']")).click();
		
		driver.switchTo().frame("loginIframe");
		driver.findElement(By.id("userName")).sendKeys("26026026");
		Thread.sleep(2000);
		driver.findElement(By.id("close-pop")).click();
		
		driver.switchTo().defaultContent();
		driver.findElement(By.name("keyword")).sendKeys("watches");
		Thread.sleep(2000);
	//	This statement is used to print the auto suggestion	
		List<WebElement> list=driver.findElements(By.xpath("//li[contains(@class,'unstructuredList')]"));
		for (WebElement element : list) {
			System.out.println(element.getText());
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='Search']")).click();
		Thread.sleep(2000);
		driver.quit();
		
		
	}

}
