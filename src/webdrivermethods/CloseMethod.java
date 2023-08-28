package webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * scenario:
 * open the browser
 * enter the flipkart.com
 * get the title and url of current page
 * close the browser
 */
public class CloseMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	//	driver.close()***not working in the current version***
		driver.quit();
	}

}
