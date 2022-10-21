package com.util;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	
	public static Object[][] loadSheet(String fileName , String sheetName) throws IOException {
		Object[][]obj = null;
		FileInputStream fis = new FileInputStream(fileName);
		/*String extention = fileName.split(".")[1];
		Workbook Book = null;
		if (extention.equals("xlsm")) {
			Book = new HSSFWorkbook(fis);
		}else if(extention.equals("xlsx")) {
			Book = new XSSFWorkbook(fis);
		}*/
	
		Workbook book = new XSSFWorkbook(fis);
		Sheet sheet = book.getSheet(sheetName);
		Row row = sheet.getRow(1);
		for (int i = 0; i < 2; i++) {
			Cell cell = row.getCell(i);
			switch (cell.getCellType()) {
			case NUMERIC:
				int num = (int) cell.getNumericCellValue();
				System.out.println(num);
				break;

			case STRING:
				String val = cell.getStringCellValue();
				System.out.println(val);
				break;
			}
		}
		
		return obj;
	}
	
	public static Object[][] loadSheet2(String fileName , String sheetName) throws IOException {
		Object[][]obj = null;
		FileInputStream fis = new FileInputStream(fileName);
		Workbook book = new XSSFWorkbook(fis);
		Sheet sheet = book.getSheet(sheetName);
		
		int rows = sheet.getLastRowNum();
		obj = new Object[rows][sheet.getRow(0).getLastCellNum()-1];
		for (int i = 1; i <= rows; i++) {
			Row row = sheet.getRow(i);
			int cells = row.getLastCellNum();
			for (int j = 1; j <cells; j++) {
				Cell cell = row.getCell(j);
				obj[i-1][j-1] = cell.getStringCellValue();
				System.out.println(obj);
			}
		}System.out.println();
		
		return obj;
	}
	
	public static void main(String[] args) throws IOException {
		//loadSheet("D:\\Book Data.xlsx", "Sheet1");
		loadSheet2("D:\\Book Data.xlsx", "Sheet1");
	}
}
