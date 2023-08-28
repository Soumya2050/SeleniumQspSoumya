package assignment;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaitPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String title=driver.getTitle();
		System.out.println(title);
		driver.findElement(By.name("email")).sendKeys("srjena2050@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("Soumya@2050");
		driver.findElement(By.name("login")).click();
		
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(10));
		boolean status=wait.until(ExpectedConditions.titleContains("Facebook"));
		
		if(status)
			System.out.println("pass");
		else
			System.out.println("fail");
		driver.quit();
	}

}
