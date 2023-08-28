package basics;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchEmptyFirefoxBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver driver=new FirefoxDriver(); 
		driver.manage().window().maximize();
	}

}
