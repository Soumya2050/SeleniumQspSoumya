package webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * scenario:
 * open the browser
 * enter the google.com
 * get the source codeof web page
 */
public class GetPageSource {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		System.out.println(driver.getPageSource());
		

	}

}
