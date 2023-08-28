package popups;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUploadUsingAutoIt {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("register_Layer")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
		Thread.sleep(3000);
		
		Runtime.getRuntime().exec("C:\\Users\\srjen\\OneDrive\\Desktop\\FileUpload.exe");
		Thread.sleep(6000);
		driver.quit();
	}

}
