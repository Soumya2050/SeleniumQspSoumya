package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class FramePractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement signin=driver.findElement(By.xpath("//span[text()='Sign In']"));
		Actions a=new Actions(driver);
		a.moveToElement(signin).perform();
		WebElement login=driver.findElement(By.xpath("//a[text()='login']"));
		login.click();
		driver.switchTo().frame("loginIframe");
		WebElement mobnum=driver.findElement(By.id("userName"));
		mobnum.sendKeys("12355");
		Thread.sleep(2000);
		WebElement closeframe=driver.findElement(By.id("close-pop"));
		closeframe.click();
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		WebElement searchTf=driver.findElement(By.id("inputValEnter"));
		searchTf.sendKeys("new one+ mobile");
		Thread.sleep(2000);
		WebElement search=driver.findElement(By.xpath("//span[@class='searchTextSpan']"));
		search.click();
		Thread.sleep(2000);
		driver.quit();
	}

}
