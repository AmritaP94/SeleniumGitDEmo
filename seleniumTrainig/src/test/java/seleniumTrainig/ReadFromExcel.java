package seleniumTrainig;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		File f = new File("C:\\workspace\\seleniumTrainig\\src\\main\\java\\data\\TestData.xls");
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet0 = wb.getSheetAt(0);
		Row r0 = sheet0.getRow(0);
		Cell c0 = r0.getCell(0);
		System.out.println(c0);
		fis.close();
		
	}

}
	