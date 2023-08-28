package dropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ToSelectPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement dropdown=driver.findElement(By.id("gh-cat"));
		
		Select s=new Select(dropdown);
		s.selectByIndex(4);
		Thread.sleep(2000);
		s.selectByValue("15032");
		Thread.sleep(2000);
		s.selectByVisibleText("Consumer Electronics");
		Thread.sleep(2000);
		
		List<WebElement>dropdownlist=s.getOptions();
		int count=0;
		for(WebElement element:dropdownlist)
		{
			//Thread.sleep(1000);
			System.out.println(element.getText());
			count++;
		}
		System.out.println(count);
		driver.quit();
	}

}
