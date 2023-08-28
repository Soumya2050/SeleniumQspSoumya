package assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ScreenshotOfWEbpage {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cricbuzz.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./screenshotpage/pic2.png");
		FileUtils.copyFile(src, dest);
		Thread.sleep(2000);
		driver.quit();
	}

}
