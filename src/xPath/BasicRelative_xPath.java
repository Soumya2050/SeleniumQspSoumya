package xPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicRelative_xPath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		driver.findElement(By.xpath("//input[@placeholder='Search for anything']")).sendKeys("Phones");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"s0-52-12-6-3-4[0]-3-1-1-list\"]/li[2]/div/a/div")).click();
		Thread.sleep(2000);
		driver.quit();
	}

	
	
	
}
