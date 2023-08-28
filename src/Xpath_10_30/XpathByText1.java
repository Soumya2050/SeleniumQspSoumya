package Xpath_10_30;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathByText1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[text()='Gift Cards']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='kitchen product']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[text()='Nema Knife Sharpner 1 Pcs']")).click();
		
		String title= driver.getTitle();
		
		if (title.equals(title))
			System.out.println("page is displayed");
		else
			System.out.println("page is not displayed");
		
		Thread.sleep(2000);
		driver.quit();
		
	}

}
