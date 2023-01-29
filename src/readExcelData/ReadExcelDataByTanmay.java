package readExcelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcelDataByTanmay {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(".data/TestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet =(Sheet) wb.getSheet("IPL");
		Row row = ((org.apache.poi.ss.usermodel.Sheet) sheet).getRow(3);
		Cell cell = row.getCell(1);
		String data = cell.getStringCellValue();
		System.out.println(data);
		
		
		
		
		
		
		
		
	}
	

}
