package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoOrangeHrmLoginScript {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver =new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		DemoOrangeHrmLogin login=new DemoOrangeHrmLogin(driver);
		
		if(login.getlogo().isDisplayed())
			System.out.println("The logo is displayed");
		else
			System.out.println("The logo is not Displayed");
		
		Thread.sleep(3000);
		
		login.setusernameTf("Admin");
		Thread.sleep(2000);
		login.setpasswordTf("admin123");
		Thread.sleep(2000);
		login.clickloginbutton();
		login.clickadmin();
		String title=driver.getTitle();
		Thread.sleep(4000);
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		boolean status=wait.until(ExpectedConditions.titleContains(title));
		
		if(status)
			System.out.println("The home page is displayed");
		else
			System.out.println("The Home page is not Displayed");
		
		driver.quit();
	}

}
