package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoActitimeLoginScript {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		DemoActitimeLoginPage login=new DemoActitimeLoginPage(driver);
		
		if(login.getlogo().isDisplayed())
			System.out.println("login page is displayed");
		else
			System.out.println("login page is not displayed");
		login.setusernameTf("admin");
		login.setpasswordTf("manager");
		login.clickkeepLoggedInCheckBox();
		login.clickloginButton();
		String title=driver.getTitle();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		boolean status=wait.until(ExpectedConditions.titleContains(title));
		if(status)
			System.out.println("Home page is displayed");
		else
			System.out.println("Home page is not Displayed");
		
		driver.quit();
		
	}

}
