package com.first;
/**
 * Equals method in String
 * @author radhi
 * Case Sensitive method
 */
public class Eight {
	public static void main(String[] args) {
	String s = new String ("HELLO");
	String t = new String ("HELLO");
	String u = new String ("HELLO World");
	System.out.println("String Content is equal? "+s.equals(t));
	System.out.println("String Content is equal? "+s.equals(u));
	System.out.println("String Content is equal? "+t.equals(u));
	System.out.println("*****************************");
	System.out.println("String address is equal? "+(s==t));
	System.out.println("String address is equal? "+(s==u));
	System.out.println("String address is equal? "+(t==u));
}
}
