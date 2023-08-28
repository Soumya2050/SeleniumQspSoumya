package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaitpractice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[text()='Dynamic Loading']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Example 1:')]")).click();
		driver.findElement(By.xpath("//button[text()='Start']")).click();
		
		WebElement header=driver.findElement(By.xpath("//h4[text()='Hello World!']"));
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		String text=wait.until(ExpectedConditions.visibilityOf(header)).getText();
		
		System.out.println(text);
		driver.quit();
	}

}
