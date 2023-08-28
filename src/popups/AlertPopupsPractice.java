package popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class AlertPopupsPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		ChromeOptions options=new ChromeOptions();
//		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		WebElement courseTab=driver.findElement(By.xpath("//a[text()='COURSE']"));
		
		Actions a=new Actions(driver);
		a.moveToElement(courseTab).perform();
		WebElement seleniumTraining=driver.findElement(By.xpath("//span[@class='wrappers']/a[text()='Selenium Training']"));
		seleniumTraining.click();
		Thread.sleep(2000);
		WebElement addToCart=driver.findElement(By.xpath("//button[.=' Add to Cart']"));
		addToCart.click();
		Thread.sleep(2000);
		Alert al=driver.switchTo().alert();
		System.out.println(al.getText());
		// to click ok
//		al.accept();
		//to click cancel
		al.dismiss();
	}

}
