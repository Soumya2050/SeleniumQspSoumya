package javascriptexecuter;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ScrollUsingElementReference {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		WebElement helpcenter=driver.findElement(By.xpath("//p[text()='Help Center']"));
		
		js.executeScript("arguments[0].scrollIntoView(true)",helpcenter);
		Thread.sleep(2000);
		
		driver.quit();
		
		
		
	}

}
