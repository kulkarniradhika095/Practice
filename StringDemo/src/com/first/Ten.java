package com.first;
/**
 * eualsIgnoreCase Method
 * @author radhi
 * compares characters but ignores lowercase/ uppercase
 * not case sensitive
 */
public class Ten {
	public static void main(String[] args) {
		String t = "Hello";
		String s = "HELLO";
		System.out.println("Using equalsIgnoreCase "+t.equalsIgnoreCase(s));
	}
}
