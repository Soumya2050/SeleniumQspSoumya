package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement src=driver.findElement(By.xpath("//h1[text()='Block 1']"));
		WebElement dest=driver.findElement(By.xpath("//h1[text()='Block 4']"));
		
		Actions a=new Actions(driver);
		a.dragAndDrop(src, dest).perform();
		Thread.sleep(5000);
		driver.quit();
	}

}
