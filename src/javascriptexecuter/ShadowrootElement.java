package javascriptexecuter;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ShadowrootElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://shop.polymer-project.org/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Object elementObj=js.executeScript("return document.querySelector(\"body > shop-app\").shadowRoot.querySelector(\"iron-pages > shop-home\").shadowRoot.querySelector(\"div:nth-child(2) > a > shop-image\").shadowRoot.querySelector(\"#img\")");
		WebElement element=(WebElement)elementObj;
		element.sendKeys("java");
	}
//document.querySelector("body > shop-app").shadowRoot.querySelector("iron-pages > shop-home").shadowRoot.querySelector("div:nth-child(2) > a > shop-image").shadowRoot.querySelector("#img")
}
