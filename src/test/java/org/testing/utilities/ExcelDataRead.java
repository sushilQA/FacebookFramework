package org.testing.utilities;

import java.io.File;
import java.io.IOException;

import jxl.*;
import jxl.read.biff.BiffException;

public class ExcelDataRead {
	
	public static String readACell(int rown , int column ) throws BiffException, IOException
	{
		File file = new File("../FacebookFramwork/src/test/java/org/testing/resources/Request.xls");
		Workbook workbook = Workbook.getWorkbook(file);
		Sheet sheet = workbook.getSheet(0);
		Cell cell = sheet.getCell(column, rown);
		return cell.getContents();
		
	}
	
	public static int getNumberOfRows() throws BiffException, IOException
	{
		File file = new File("../FacebookFramwork/src/test/java/org/testing/resources/Request.xls");
		Workbook workbook = Workbook.getWorkbook(file);
		Sheet sheet = workbook.getSheet(0);
		return sheet.getRows();
		
	}
	
	public static int getNumberOfColumns() throws BiffException, IOException
	{
		File file = new File("../FacebookFramwork/src/test/java/org/testing/resources/Request.xls");
		Workbook workbook = Workbook.getWorkbook(file);
		Sheet sheet = workbook.getSheet(0);
		return sheet.getColumns();
		
	}

}
