package popups;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class HandleAnyNotification {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		HashMap<String,Integer> contentsettings=new HashMap<>();
		contentsettings.put("notifications", 1);
		contentsettings.put("geolocation", 2);
		
		HashMap<String,Object> profile=new HashMap<>();
		profile.put("managed_default_content_settings", contentsettings);
		
		HashMap<String,Object> preference=new HashMap<>();
		preference.put("profile", profile);
		
		EdgeOptions options = new EdgeOptions();
	//	options.addExtensions(new File("/path/to/extension.crx"))
	//	options.addArguments("--remote-allow-origins=*");
		options.setExperimentalOption("prefs", preference);
		
		WebDriver driver=new EdgeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/");
		Thread.sleep(2000);
		driver.quit();
	}

}
