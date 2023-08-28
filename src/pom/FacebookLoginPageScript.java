package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FacebookLoginPageScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		FacebookLoginPage login=new FacebookLoginPage(driver);
		
		if(login.getlogo().isDisplayed())
			System.out.println("The logo is Displayed");
		else
			System.out.println("The logo is not Displayed");
		
		login.setusernameTf("7077522939");
		login.setpasswordTf("Soumya@2050");
		login.clickloginbutton();
		String title=driver.getTitle();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		boolean status=wait.until(ExpectedConditions.titleContains(title));
		
		if(status)
			System.out.println("The home page is displayed");
		else
			System.out.println("the home page is not displayed");
		
		driver.quit();
	}

}
