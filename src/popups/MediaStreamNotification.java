package popups;

import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class MediaStreamNotification {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		HashMap<String,Integer> contentsettings=new HashMap<>();
		contentsettings.put("media_stream", 1);
		
		HashMap<String,Object> profile=new HashMap<>();
		profile.put("managed_default_content_settings", contentsettings);
		
		HashMap<String,Object> preference=new HashMap<>();
		preference.put("profile", profile);
		
		EdgeOptions options = new EdgeOptions();
	//	options.addExtensions(new File("/path/to/extension.crx"));
	//	options.addArguments("--remote-allow-origins=*");
		options.setExperimentalOption("prefs", preference);
		
		WebDriver driver=new EdgeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://webcamtests.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("webcam-launcher")).click();
		Thread.sleep(3000);
		driver.quit();
	}

}
