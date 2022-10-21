package com.string;
/**
 * stringMethods allInOne
 * @author radhi
 *
 */
public class stringMethods {
	public static void main(String[] args) {
		String a = "Ankit";
		String b = "Rahul";
		System.out.println(a.toLowerCase());
		
		System.out.println(b.toUpperCase());

		System.out.println(b.concat(a));

		System.out.println(b.length() + a.length() );
		
		String c = "             RADHIKA            ";
		
		System.out.println(c.trim());
		String d = "";
		System.out.println("Is the string empty? -->"+d.isEmpty());

		System.out.println(b.charAt(2));

		System.out.println(a.indexOf(c));


		
	}
}
