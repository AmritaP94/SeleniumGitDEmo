package seleniumTrainig;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.common.collect.Table.Cell;

public class WriteToExcel {

	public static void main(String[] args) throws IOException {
		XSSFWorkbook book = new XSSFWorkbook(); 
		XSSFSheet sheet1 = book.createSheet("Sheet1");
		
		XSSFRow r0 = sheet1.createRow(0);
		XSSFCell c0 = r0.createCell(0);
		c0.setCellValue("RCV Academy");
		
		File f = new File("C:\\workspace\\seleniumTrainig\\src\\main\\java\\data\\TestData.xls");
		FileOutputStream fos = new FileOutputStream(f);
		
		book.write(fos);
		
		fos.close();
		book.close();
		
		System.out.println("File written successfully");

	}

}
