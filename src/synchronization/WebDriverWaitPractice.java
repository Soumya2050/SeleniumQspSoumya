package synchronization;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaitPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.xpath("//a[text()='View Time-Track']")).click();
		System.out.println(driver.getTitle());
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		boolean status=wait.until(ExpectedConditions.titleContains("View Time-Track"));
		
		if(status)
			System.out.println("pass");
		else
		System.out.println("fail");
		
		driver.quit();
	}

}
