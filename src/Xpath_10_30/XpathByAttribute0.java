package Xpath_10_30;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathByAttribute0 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("Watches");
		driver.findElement(By.xpath("//a[@class='desktop-submit']")).click();
		
		String title=driver.getTitle();
		
		if(driver.getTitle().contains(title))
			System.out.println("test script is pass");
		else
			System.out.println("test script is failed");
		Thread.sleep(2000);
		
		driver.quit();
		
		
	}

}
