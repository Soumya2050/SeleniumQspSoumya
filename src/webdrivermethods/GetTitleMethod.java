package webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

/*
 * Scenario:
 * open the browser 
 * Enter the facebook.com
 * verify
 */
public class GetTitleMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		String title=driver.getTitle();
		
		System.out.println(title);
		
		if(title.contains("Facebook"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
		driver.quit();
	}

}
