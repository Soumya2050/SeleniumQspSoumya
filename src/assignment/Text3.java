package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Text3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//span[text()='Downloads']"
				+ "/parent::a/parent::li/following-sibling::li[3]/a[.='Support']")).click();
		Thread.sleep(6000);
		driver.navigate().refresh();
		driver.findElement(By.xpath("//span[text()='Blog']"
				+ "/parent::a/parent::li/preceding-sibling::li[4]/a[.='Downloads']")).click();
		
		Thread.sleep(3000);
		
		driver.quit();
	}

}
//span[text()='Downloads']/parent::a/parent::li/following-sibling::li[3]/a[.='Support']