package com.first;

public class First {
	public static void main(String[] args) {
		String s = "Hello";
		String t = s.concat(" Aditi");
		
		if (s==t) {
			System.out.println("Equal");
		} else {
			System.out.println("Not Equal");
		}
		System.out.println(t);
	}
}
