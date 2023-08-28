package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FileUploadUsingSendKeys {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.foundit.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//div[contains(text(),'Upload Resume')]")).click();
		
		driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\srjen\\OneDrive\\Desktop\\Resume_Soumya.pdf");
		Thread.sleep(3000);
		driver.quit();
	}
	//"C:\\Users\\srjen\\OneDrive\\Desktop\\Resume_Soumya.pdf"

}
