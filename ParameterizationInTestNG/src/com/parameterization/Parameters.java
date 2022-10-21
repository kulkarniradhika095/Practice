package com.parameterization;

import org.testng.annotations.Test;

import com.config.Config;
public class Parameters extends Config{
	@Test
	public void m1() {
		System.out.println("m1");
	}
	
	
	@org.testng.annotations.Parameters({"num1","num2"})
	@Test
	public void m2(String num1 , String num2) {
		System.out.println("m2: "+ num1 +"\t"+ num2);
	}
	@org.testng.annotations.Parameters({"num3","num4"})
	@Test
	public void m3(String x, String y){
		int p =  Integer.valueOf(x);
		int q =  Integer.valueOf(y);
		
		System.out.println("m3: " +p+"\t"+q);
	}
	@Test
	public void m4() {
		System.out.println("m4");
	}
	@Test
	public void m5() {
		System.out.println("m5");
	}
	@Test
	public void m6() {
		System.out.println("m6");
	}
	@Test
	public void m7() {
		System.out.println("m7");
	}
}
