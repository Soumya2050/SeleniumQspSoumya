package xPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TraversingXpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.vtiger.com/crm-demo/");
		driver.findElement(By.xpath("//img[@alt='vtiger crm']/../../div/div/ul/li/a[contains(text(),'Resources')]")).click();
		Thread.sleep(2000);
	}

}
