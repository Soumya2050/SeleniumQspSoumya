package assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownUsingSelectTagPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement click=driver.findElement(By.id("gh-cat-box"));
		click.click();
		List<WebElement> list=driver.findElements(By.xpath("//select/option"));
		int count = list.size();
		System.out.println("count of list is"+count);
		
		for (WebElement webElement : list) 
		{
			System.out.println(webElement.getText());
		}
		WebElement dd = driver.findElement(By.xpath("//select"));
		Select s = new Select(dd);
		
		if(s.isMultiple())
		{
			s.getOptions();
		}
		else
		{
			s.selectByVisibleText("Baby");
			WebElement submit = driver.findElement(By.id("gh-btn"));
			submit.click();
			driver.navigate().back();
			driver.navigate().refresh();
			Thread.sleep(2000);
//			driver.close();
			
			WebElement dd1 = driver.findElement(By.xpath("//select"));
			Select s1 = new Select(dd1);
			Thread.sleep(2000);
			s1.selectByIndex(0);
//			s.selectByVisibleText("Baby");
			WebElement submit1 = driver.findElement(By.id("gh-btn"));
			submit1.click();
			driver.navigate().back();
			driver.navigate().refresh();
			Thread.sleep(2000);
//			driver.close();
			
			WebElement dd2 = driver.findElement(By.xpath("//select"));
			Select s2 = new Select(dd2);
			Thread.sleep(2000);
			s2.selectByValue("1");
			WebElement submit2 = driver.findElement(By.id("gh-btn"));
			submit2.click();
			driver.navigate().back();
			driver.navigate().refresh();
			Thread.sleep(2000);
			driver.close();
			
		}
		
	}
}
