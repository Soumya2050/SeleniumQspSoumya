package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DoubleClickPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement courseTab=driver.findElement(By.xpath("//a[text()='COURSE']"));
		Thread.sleep(3000);
		Actions a=new Actions(driver);
		a.moveToElement(courseTab).perform();
		driver.findElement(By.xpath("//span[@class='wrappers']/a[text()='Selenium Training']"))
		.click();
		Thread.sleep(3000);
		WebElement plusbutton=driver.findElement(By.id("add"));
		a.doubleClick(plusbutton).perform();
		Thread.sleep(3000);
		WebElement quantity=driver.findElement(By.id("quantity"));
		
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
		String text=wait.until(ExpectedConditions.visibilityOf(quantity)).getAttribute("value");
		System.out.println(text);
		driver.quit();
		

	}
	

}
