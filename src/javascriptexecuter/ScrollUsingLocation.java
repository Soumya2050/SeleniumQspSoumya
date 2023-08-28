package javascriptexecuter;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ScrollUsingLocation {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		WebElement helpcenter=driver.findElement(By.xpath("//p[text()='Help Center']"));
		
		Point location=helpcenter.getLocation();
		int x=location.getX();
		int y=location.getY();
		System.out.println(x+" "+y);
		
		
		js.executeScript("window.scrollBy("+x+","+y+")");
		Thread.sleep(2000);
		driver.quit();
		
	}

}
