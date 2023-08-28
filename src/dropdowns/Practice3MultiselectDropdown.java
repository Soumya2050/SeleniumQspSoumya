package dropdowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

/*
 * 
 */
public class Practice3MultiselectDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement dropdown=driver.findElement(By.id("cars"));
		
		Select s=new Select(dropdown);
		if(s.isMultiple())
		{
			s.selectByIndex(0);
			Thread.sleep(2000);
			s.selectByIndex(1);
			Thread.sleep(2000);
			s.selectByValue("199");
			Thread.sleep(2000);
			
			//s.deselectAll();
			s.deselectByIndex(0);
			Thread.sleep(2000);
			s.deselectByValue("99");
			Thread.sleep(2000);
			s.deselectByIndex(2);
			Thread.sleep(2000);
			
			driver.quit();
		}
		else
		{
			System.out.println("single select");
		}
	}

}
