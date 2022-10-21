package com.dataproviders;

import java.io.IOException;

import org.testng.annotations.DataProvider;

import com.util.ExcelReader;

public class Dataproviders {
	
	@DataProvider(name = "Book Data")
	public Object[][]  dataProvider() throws IOException {
		ExcelReader excel = new ExcelReader();
		return excel.loadSheet2("D:\\Book Data1.xlsx", "Sheet1");
		//return excel.loadSheet2("D:\\BookData1.xlsm", "Sheet1");
		
	}
	
	@DataProvider(name = "Order Data")
	public Object [][] orderData() {
		Object[][] obj = null;
		return obj;
	}
}
