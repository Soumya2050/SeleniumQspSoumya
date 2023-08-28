package assignment;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class FlipKartMobilePrices {
		
		@Test
		public void writemobilepricestoexcel() throws IOException
		{
			FileInputStream fis=new FileInputStream("./TestResources/TestData.xlsx");
			Workbook wb=WorkbookFactory.create(fis);
			Sheet sh=wb.getSheet("Sheet2");
			
			WebDriver driver=new EdgeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.flipkart.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			driver.findElement(By.className("_2doB4z")).click();
			driver.findElement(By.name("q")).sendKeys("mobiles");
			driver.findElement(By.className("L0Z3Pu")).click();
			List<WebElement> mobilelist=driver.findElements(By.xpath("//div[@class='_4rR01T']"));
/*//div[text()='POCO C50 (Royal Blue, 32 GB)']/parent::div/following-sibling::div
			/descendant::div[@class='_30jeq3 _1_WHN1']	*/
			
			for(int i=0;i<mobilelist.size();i++)
			{
				String name=mobilelist.get(i).getText();
				String price=driver.findElement(By.xpath("//div[text()='"+name+"']/parent::div/following-sibling::div/descendant::div[@class='_30jeq3 _1_WHN1']")).getText();
				sh.createRow(i).createCell(0).setCellValue(name);
				sh.getRow(i).createCell(1).setCellValue(price);
			}
			FileOutputStream fos=new FileOutputStream("./TestResources/TestData.xlsx");
			wb.write(fos);
			wb.close();
			driver.quit();
		}


}
