package screenshot;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class FullWebPageScreenshot {

	public static void main(String[] args) throws FileNotFoundException, IOException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://selenium.dev/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Screenshot src=new AShot().shootingStrategy
				(ShootingStrategies.viewportPasting(1000))
				.takeScreenshot(driver);
		ImageIO.write(src.getImage(),"PNG",new FileOutputStream("./Screenshot/Fullwebpage2.png"));
		Thread.sleep(2000);
		driver.quit();
	}

}
