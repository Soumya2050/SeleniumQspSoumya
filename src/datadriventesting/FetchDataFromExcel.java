package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method 
		//step 1: Convert phycal file into java readable object
		FileInputStream fis=new FileInputStream("./TestResources/TestData.xlsx");
		
		//step 2: Open work Book
		// WorkbookFactory.create(fis):throws EncryptedDocumentException
		
		Workbook wb=WorkbookFactory.create(fis);
		
//		//step 3: Get control Over sheet
//		
//		Sheet sh=wb.getSheet("Sheet1");
//		
//		//step 4: Get control over row
//		
//		Row r =sh.getRow(3);
//		
//		//step 5: get control over cell
//		
//		Cell c=r.getCell(1);
//		
		//step 6: Fetch data from cell
		
		String data  = wb.getSheet("Sheet1").getRow(3).getCell(1).getStringCellValue();
		String data1 = wb.getSheet("Sheet1").getRow(2).getCell(1).getStringCellValue();
		String data2 = wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		System.out.println(data );
		System.out.println(data1);
		System.out.println(data2);
		System.out.println(wb.getSheet("Sheet1").getRow(2).getCell(2).getNumericCellValue());
		
		//step 7: close the excel
		
		wb.close();
		
		}

 	}
