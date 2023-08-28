package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ActitimeLoginTestUsingPropertiesFile {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("./TestResources/Data.properties");
		Properties property=new Properties();
		property.load(fis);
		
		String url =property.getProperty("url");
		String username =property.getProperty("user1");
		String password =property.getProperty("pwd1");
		
		long time =Long.parseLong(property.getProperty("timeouts"));
		
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
		driver.findElement(By.id("username")).sendKeys(username+Keys.TAB+password+Keys.ENTER);
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(time));
		wait.until(ExpectedConditions.titleContains("Enter Time-Track"));
		Thread.sleep(2000);
		driver.quit();
	}

}
