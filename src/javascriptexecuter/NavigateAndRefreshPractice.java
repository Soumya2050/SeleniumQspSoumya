package javascriptexecuter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class NavigateAndRefreshPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		String url="https://www.flipkart.com/";
		Thread.sleep(2000);
		js.executeScript("window.location=arguments[0]", url);
		js.executeScript("history.go(0)");
		//TO fetch title
		System.out.println(js.executeScript("return document.title"));//to fetch title
		//To fetch url
		System.out.println(js.executeScript("return document.URL"));//to
		Thread.sleep(2000);
		
		//to click on an element
		WebElement closebutton=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		js.executeScript("arguments[0].click()", closebutton);//"arguments[0].click()",Ele
		Thread.sleep(3000);
		WebElement searchTF=driver.findElement(By.name("q"));
		Thread.sleep(3000);
		js.executeScript("arguments[0].value=arguments[1]", searchTF,"headphones");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		//driver.quit();
	}

}
