package popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUploadUsingRobotClass {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
//		ChromeOptions options=new ChromeOptions();
//		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("register_Layer")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
		Thread.sleep(3000);
		//step-1:select file path to be uplooad
		StringSelection str=new StringSelection("C:\\Users\\srjen\\OneDrive\\Desktop\\Resume_Soumya.pdf");
		
		//step-2:copy the path to system clip board
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		
		//step-3:press ctrl+v
		
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		// release the press key
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		
		//STEP-4:PRESS ENTER
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(3000);
		driver.quit();
		
	}

}
