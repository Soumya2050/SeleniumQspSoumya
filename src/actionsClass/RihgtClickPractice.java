package actionsClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/*
 * Scenario:
 * open the browser
 * enter the demoapp.skillrary.com
 * Rigth click on selenium Training
 * Open in new Tab
 * close the browser
 */
public class RihgtClickPractice {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement seleniumTraining=driver.findElement(By.xpath("//li/a[text()='Selenium Training']"));
		Actions a=new Actions(driver);
		a.contextClick(seleniumTraining).perform();
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_RIGHT);
		Thread.sleep(2000);
		r.keyRelease(KeyEvent.VK_RIGHT);
		
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		driver.quit();
		
	}

}
