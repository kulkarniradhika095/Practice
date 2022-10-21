package com.first;

import java.util.Iterator;

/**
 * CharAT method
 * @author radhi
 * ConCat Methos
 */
public class Eleven {
	public static void main(String[] args) {
		String t = "Hello";
		String s = "HELLO";
		
			for (int i = 0; i < s.length(); i++) {
				System.out.println(s.charAt(i));
			}
			System.out.println(s.concat(t));
	}
	
}
