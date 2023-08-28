package framesAndwindows;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/*
 * Scenario:
 * Type NDTV..com
 * Click on crossword
 * click on Reveal
 * Click on word
 * Click on cricket
 * close the browser
 */
public class FramesNDTVpractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ndtv.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("gavtab-10")).click();
		//Thread.sleep(2000);
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//span[@class='brw-nav_wrp'][text()='Reveal ']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("revealWord")).click();
		Thread.sleep(2000);
		
		
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='CRICKET']")).click();
		Thread.sleep(2000);
		
		driver.quit();
		
	}

}
