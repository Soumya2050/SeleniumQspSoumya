package webelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText_GetTagName_GetAccessibleName_GetAttribute_Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement login=driver.findElement(By.name("login"));
		
		System.out.println(login.getText());
		System.out.println(login.getTagName());
		System.out.println(login.getAccessibleName());
		System.out.println(login.getAttribute("class"));
		driver.quit();
		

	}

}
