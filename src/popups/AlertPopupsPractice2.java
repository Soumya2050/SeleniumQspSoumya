package popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AlertPopupsPractice2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		
		Alert al=driver.switchTo().alert();
		System.out.println(al.getText());
		Thread.sleep(2000);
		al.sendKeys("soumya");
		Thread.sleep(2000);
		al.accept();
		Thread.sleep(2000);
		
		driver.quit();
		
		
	}

}
