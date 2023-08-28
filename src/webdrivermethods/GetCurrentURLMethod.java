package webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/*
 * scenario:
 * open the browser
 * enter the amazon.com
 * get the title of the web page
 * get the url of the web page
 */
public class GetCurrentURLMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		String title=driver.getTitle();
		String url=driver.getCurrentUrl();
		System.out.println(title+"\n"+url);
		Thread.sleep(5000);
		driver.quit();
	}

}
