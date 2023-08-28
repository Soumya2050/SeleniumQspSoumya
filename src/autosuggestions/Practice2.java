package autosuggestions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Practice2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.name("q")).sendKeys("soumyaranjan");
		Thread.sleep(2000);
		List<WebElement> auto=driver.findElements(By.xpath("//li[contains(@class,'sbct' )]"));
		
		for (WebElement element : auto) {
			
			System.out.println(element.getText());
			
		}
		Thread.sleep(2000);
		driver.close();
	}

}
