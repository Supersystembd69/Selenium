package excelExportAndFileIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFile {
	
	/*public Sheet readExcel(String filePath,String fileName,String sheetName) throws IOException{
	
		File file =	new File(filePath+"\\"+fileName);
		
		FileInputStream fis = new FileInputStream(file);
		
		Workbook wb = new XSSFWorkbook(fis);
		
		Sheet  WSheet = wb.getSheet(sheetName);
		
		 return WSheet;
	}*/
}//end of class
