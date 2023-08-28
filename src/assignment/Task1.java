package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

/*
 * Scenario:
 * Open the browser
 * Enter the google.com
 * Enter the your name in search text field
 * Close the browser
 */
public class Task1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("soumyaranjan jena");
		Thread.sleep(2000);
		driver.quit();
	}

}
