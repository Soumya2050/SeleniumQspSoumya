package crossBrowserParallelExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseClass {
	WebDriver driver;
	@Parameters("Browser")
	@BeforeMethod
	public void methodsetup(String browser)
	{
		switch(browser)
		{
		case "chrome":
			ChromeOptions options=new ChromeOptions();
			options.addArguments("---remote-allow-origins*");
			driver=new ChromeDriver(options);
			break;
		case "firefox":driver=new FirefoxDriver();
		break;
		
		case "Edge":driver=new EdgeDriver();
		break;
		default:System.out.println("invalid browser info");
		
		}
		driver.manage().window().maximize();
		
	}
	@AfterMethod
	public void methodTeardown()
	{
		driver.quit();
	}
	
}
