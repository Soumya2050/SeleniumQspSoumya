package autosuggestions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * Scenario:
 * Open the browser
 * Enter amazon.com
 * Type laptop in search text field
 * Fetch all auto suggestion
 * Close the browser
 */
public class Practice1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("laptop");
		Thread.sleep(5000);
		List<WebElement> autosuggestion=driver.findElements(By.xpath("//div[contains(@aria-label,'laptop')]"));
		
		for(WebElement element:autosuggestion)
		{
			Thread.sleep(3000);
			System.out.println(element.getText());
		}
		
		driver.quit();
	}

}
