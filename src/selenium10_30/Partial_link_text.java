package selenium10_30;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Partial_link_text {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver d = new EdgeDriver();
		d.manage().window().maximize();
		
		d.get("https://skillrary.com/");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		d.findElement(By.partialLinkText("WEBINAR")).click();
//		Thread.sleep(5000);
//		d.quit();
	}

}
