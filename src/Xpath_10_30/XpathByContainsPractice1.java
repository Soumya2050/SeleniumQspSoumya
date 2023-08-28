package Xpath_10_30;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathByContainsPractice1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String header=driver.findElement(By.xpath("//h2[contains(text(),'Facebook')]")).getText();
		String headerText=driver.findElement(By.xpath("//a[contains(@title,'Read')]")).getText();
		Thread.sleep(2000);
		System.out.println(header);
		System.out.println(headerText);
		Thread.sleep(2000);
		driver.quit();

	}

}
