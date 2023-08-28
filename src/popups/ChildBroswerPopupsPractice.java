package popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

/*
 * Scenario:
 * Open the browser
 * Enter skillrary.com
 * Click on Gears
 * Click on Skillrary Essay
 * Type your name in Enter name text field
 * Click on yes it's my name
 * close the child browser
 * quite the browser
 */
public class ChildBroswerPopupsPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		EdgeOptions options=new EdgeOptions();
//		options.setBinary(new File("/path/to/edge"));
		WebDriver driver=new EdgeDriver();	
		driver.manage().window().maximize();	
		driver.get("https://skillrary.com/");		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
		driver.findElement(By.xpath("//a[text()=' GEARS ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//ul[@class='dropdown-menu gear_menu']/descendant::a[text()=' SkillRary Essay']")).click();		
		String Parentid=driver.getWindowHandle();		
		Set<String>windowsids =driver.getWindowHandles();		
		for (String string : windowsids)
		{
			driver.switchTo().window(string);
		}		
		driver.findElement(By.id("mytext")).sendKeys("soumya");		
		driver.findElement(By.id("yes")).click();
		Thread.sleep(3000);
		driver.close();		
		Thread.sleep(2000);		
		driver.switchTo().window(Parentid);
		
	}	
		
}
