package webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleMethodInAMAZON {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		String title=driver.getTitle();
		
		System.out.println(title);
		
		if(title.contains("Amazon"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		
		
	}

}
