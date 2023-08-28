package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataFormatterPractice {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("./TestResources/TestData.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		DataFormatter df=new DataFormatter();
		Sheet sh=wb.getSheet("Sheet1");
		System.out.println(df.formatCellValue(sh.getRow(1).getCell(1)));
		wb.close();
	}

}
