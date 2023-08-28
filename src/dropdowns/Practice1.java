package dropdowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/*
 * Scenario:
 * open the browser
 * enter amazon.com
 * select element from all dropdowns using index,value and text
 * close the browser
 */
public class Practice1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement dropdown=driver.findElement(By.id("searchDropdownBox"));
		
		Select s=new Select(dropdown);
		
		s.selectByIndex(5);
		Thread.sleep(3000);
		s.selectByValue("search-alias=appliances");
		Thread.sleep(3000);
		s.selectByVisibleText("Apps & Games");
		Thread.sleep(3000);
		
		driver.quit();
		
	}

}
