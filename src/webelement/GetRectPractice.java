package webelement;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRectPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver  driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement loginbutton=driver.findElement(By.name("login"));
		
		Rectangle r=loginbutton.getRect();
		System.out.println(r.getX());
		System.out.println(r.getY());
		System.out.println(r.getHeight());
		System.out.println(r.getWidth());
		
		driver.quit();

	}

}
