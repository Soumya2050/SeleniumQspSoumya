package javascriptexecuter;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class DisabledTextbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/srjen/OneDrive/Desktop/disabled.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement textbox=driver.findElement(By.id("soumya"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("arguments[o].value=argumrnts[1]", textbox,"selenium");
	}

}
