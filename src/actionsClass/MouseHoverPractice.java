package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

/*
 * Scenario:open the browser
 * Enter demoapp.skillrary.com
 * Mouse hover on course
 * click on selenium training
 * close the browser
 */
public class MouseHoverPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement courseTab=driver.findElement(By.id("course"));
		Actions a=new Actions(driver);
		a.moveToElement(courseTab).perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@class='wrappers']/a[text()='Selenium Training']")).click();
		Thread.sleep(5000);
		driver.quit();
	}

}
