package locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PartialLinkTextLocator2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.partialLinkText("Forgot")).click();
		Thread.sleep(3000);
		driver.quit();
		
	}

}
