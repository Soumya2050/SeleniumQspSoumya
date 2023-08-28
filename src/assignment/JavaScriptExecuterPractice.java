package assignment;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class JavaScriptExecuterPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		JavascriptExecutor js =(JavascriptExecutor)driver;
		String url="https://www.ebay.com/";
		Thread.sleep(2000);
		//navigate to application
		js.executeScript("window.location=arguments[0]", url);
		Thread.sleep(3000);
		//to refresh application
		js.executeScript("history.go(0)");
		//to fetch title
		System.out.println(js.executeScript("return document.title"));
		//to fetch url
		System.out.println(js.executeScript("return document.URL"));
		//to click an element
//		WebElement click=driver.findElement(By.xpath("//a[text()='Registry']"));
//		Thread.sleep(2000);
//		js.executeScript("arguments[0].click()", click);
//		//to pass the value to the text field
//		WebElement searchTf=driver.findElement(By.id("twotabsearchtextbox"));
//		Thread.sleep(2000);
//		js.executeScript("arguments[0].value=arguments[1]",searchTf,"wathces");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		driver.quit();
		
		
	}

}
