package com.Singleton;

public class Yashpal {
	public static void main(String[] args) {
		Sachin S = Sachin.getInstance();
		Sachin S1 = Sachin.getInstance();
		Sachin S2 = Sachin.getInstance();
		Sachin S3 = Sachin.getInstance();
		
		Object o1 =  new Object();
		Object o2 =  new Object();
		//Compare memory address of two objects
		if (S1==S2) {
			System.out.println("Equal");
		}else {
			System.out.println("Not Equal");
		}
	}
}
