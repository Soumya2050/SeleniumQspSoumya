package xPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvancedRelativeXpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.selenium.dev/downloads/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Downloads']/following::span[contains(text(),'Blog')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='2023']")).click();
		Thread.sleep(5000);
		driver.quit();
	}

}
