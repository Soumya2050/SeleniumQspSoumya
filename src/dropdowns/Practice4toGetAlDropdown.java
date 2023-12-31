package dropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice4toGetAlDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement dropdown=driver.findElement(By.id("cars"));
		
		Select s=new Select(dropdown);
		List<WebElement> options=s.getOptions();
		
		for (WebElement webElement : options)
		{
			System.out.println(webElement.getText());
		}
		if(s.isMultiple())
		{
			s.selectByIndex(0);
			s.selectByIndex(1);
			s.selectByIndex(2);
			s.selectByIndex(3);
			Thread.sleep(2000);
			System.out.println("<------------------------>");
			
			System.out.println("first selected option-->: "+s.getFirstSelectedOption().getText());
			List<WebElement>selectedoptions=s.getAllSelectedOptions();
			System.out.println("\nAll selected options--->");
			for (WebElement webElement : selectedoptions)
			{
				Thread.sleep(2000);
				System.out.println(webElement.getText());
			}
			s.deselectAll();
		}
		else
		{
			System.out.println("single select");
		}
		driver.quit();
	}

}
