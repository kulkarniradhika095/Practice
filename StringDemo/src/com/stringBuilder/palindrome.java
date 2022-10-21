package com.stringBuilder;

import java.util.Scanner;

/**
 * String Palindrome
 * @author radhi
 *
 */ 
public class palindrome {
	public String reverse(String input) {
		String rev = "";
		StringBuffer sb = new StringBuffer(input);
		sb.reverse();
		String rev1 = new String(sb);
		return rev1;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to check if it is palindrome or not? ");
		String in = sc.nextLine();
		
		palindrome s = new palindrome();
		String rev = s.reverse(in);
	
		if (in.equals(rev)) {
			System.out.println("String is Palindrome");
		} else {
			System.out.println("String is not Palindrome");
		}
	}
}
