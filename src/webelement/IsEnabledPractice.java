package webelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement loginbutton=driver.findElement(By.xpath("//button[.='Log in']"));
		
		if(loginbutton.isEnabled())
		{
			System.out.println("login button is enabled");
		}
		else
		{
			System.out.println("login button is disabled");
		}
		
		driver.quit();
	}

}
