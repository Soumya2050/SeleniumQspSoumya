package dropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement dropdown=driver.findElement(By.id("searchDropdownBox"));
		
		Select s=new Select(dropdown);
		
		List<WebElement> dropdownlist=s.getOptions();
		for (WebElement webElement : dropdownlist) 
		{
			//Thread.sleep(2000);
			System.out.println(webElement.getText());
		}
		
		driver.quit();
	}

}
