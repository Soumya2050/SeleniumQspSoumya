package Xpath_10_30;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathByAttribute2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("(//div[@class='desktop-navLink'])[3]")).click();
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
