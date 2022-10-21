package com.first;
/**
 * variable address is stored in heap memory
 * String value is stored in SCP
 * @author radhi
 *
 */

public class Fourth {
	public static void main(String[] args) {
		
		String s = new String ("Hello");
		String t = new String ("Hello");
		
		
		if (s==t) {
			System.out.println("Equal");
		} else {
			System.out.println("Not Equal");
		}
		System.out.println(t);
}
}