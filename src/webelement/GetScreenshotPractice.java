package webelement;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetScreenshotPractice {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriver  driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bollymoviereviewz.com/2013/04/bollywood-box-office-collection-2013.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		WebElement fullscrn=driver.findElement(By.id("gp-breadcrumbs"));
		File src =fullscrn.getScreenshotAs(OutputType.FILE);
		File dest=new File("./Screenshot/"+fullscrn.getText()+".png");
		FileUtils.copyFile(src, dest);
		Thread.sleep(2000);
		driver.quit();
		
		

	}

}
