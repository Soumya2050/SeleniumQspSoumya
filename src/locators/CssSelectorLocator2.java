package locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CssSelectorLocator2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#keepLoggedInCheckBox")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a#loginButton")).click();
		Thread.sleep(2000);

		String homepage=driver.getTitle();

		if (driver.getTitle().contains(homepage))
			System.out.println("Home page is displayed");
		else
			System.out.println("Home page is not displayed");
		Thread.sleep(2000);
		driver.quit();
	}

}
