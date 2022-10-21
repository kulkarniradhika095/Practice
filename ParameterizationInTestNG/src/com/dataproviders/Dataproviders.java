package com.dataproviders;

import org.testng.annotations.DataProvider;

public class Dataproviders {
	
	@DataProvider(name = "Book Data")
	public Object[][]  dataProvider() {
		Object[][] obj = {
				{"Old Man and the sea" ,"Ernest Hamingway"},
				{"Sun also rises","Ernest Hamingway"},
				{"Kosala","Bhalchandra Nemade"},
				{"Raavan","Sharad Tandale"},
				{"Half Girlfriend","Chetan Bhagat"}
			};
		return obj;
	}
	
	@DataProvider(name = "Order Data")
	public Object [][] orderData() {
		Object[][] obj = {{}};
		return obj;
	}
}
