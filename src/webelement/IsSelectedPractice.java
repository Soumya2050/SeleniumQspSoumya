package webelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement checkbox=driver.findElement(By.name("remember"));
		checkbox.click();
		if(checkbox.isSelected())
		{
			System.out.println("checkbox is selected");
		}
		else
		{
			System.out.println("checkbox is not selected");
		}
		
		driver.quit();

	}

}
