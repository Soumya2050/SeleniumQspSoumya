package datadriventesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ModifyExccelFile {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("./TestResources/TestData.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet("Sheet1");
		Row r=sh.getRow(0);
		//Row r=sh.createRow(4);
		Cell c=r.createCell(5);
		//c.setCellValue("Soumya");
		c.setCellValue("Qspider");
		FileOutputStream fos=new FileOutputStream("./TestResources/TestData.xlsx");
		wb.write(fos);
		wb.close();
	}

}
