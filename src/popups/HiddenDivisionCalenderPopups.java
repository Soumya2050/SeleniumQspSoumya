package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class HiddenDivisionCalenderPopups {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.yatra.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(2000);
		driver.findElement(By.id("BE_flight_origin_date")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("31/03/2023")).click();
		
		Thread.sleep(3000);
		driver.quit();
		
		
		
	}

}
