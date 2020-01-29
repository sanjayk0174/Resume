package steps;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadWrite {

	public String getFromdata() throws IOException
	{
		XSSFWorkbook wb;
		XSSFSheet sheet;
		XSSFRow row;
		XSSFCell cell;
		FileInputStream fis = new FileInputStream("C:\\Users\\701759\\Desktop\\selenium.xlsx");
		wb = new XSSFWorkbook(fis);
		sheet = wb.getSheet("Sheet1");
		row = sheet.getRow(0);
		cell= row.getCell(0);
		String from=cell.getStringCellValue();
		wb.close();
		return from;
		
	}
	
	public String getToData() throws IOException
	{
		XSSFWorkbook wb;
		XSSFSheet sheet;
		XSSFRow row;
		XSSFCell cell;
		FileInputStream fis = new FileInputStream("C:\\Users\\701759\\Desktop\\selenium.xlsx");
		wb = new XSSFWorkbook(fis);
		sheet = wb.getSheet("Sheet1");
		row = sheet.getRow(0);
		cell= row.getCell(1);
		String to=cell.getStringCellValue();
		wb.close();
		return to;
		
	}
}
