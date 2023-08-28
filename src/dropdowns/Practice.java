package dropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement dropdown=driver.findElement(By.name("addresstype"));
		Select s=new Select(dropdown);
		
		List<WebElement> options=s.getOptions();
		for (WebElement element : options) {
			System.out.println(element.getText());
		}
		if (s.isMultiple()) {
			s.selectByIndex(0);
			Thread.sleep(2000);
			s.selectByVisibleText("Development");
			Thread.sleep(2000);
			s.selectByVisibleText("Dance");
			Thread.sleep(2000);
			s.selectByIndex(8);
			
			
		}
		else {
			System.out.println("single select");
		}
		driver.close();
	}

}
