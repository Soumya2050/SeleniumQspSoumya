package webelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getsizepractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver  driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement loginbutton=driver.findElement(By.name("login"));
		
		Dimension d=loginbutton.getSize();
		System.out.println(d.getHeight());
		System.out.println(d.getWidth());
		
		driver.quit();

	}

}
