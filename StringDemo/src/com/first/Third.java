package com.first;
/**
 * SCP String Constant Pool does not allow duplicate elements instead it points the 
 * memory location of already assigned element
 * @author radhi
 *
 */

public class Third {
	public static void main(String[] args) {
		
	String s = "Hello";
	String y = "Hello";
	
	
	if (s==y) {
		System.out.println("Equal");//if memory loc same print equal
	} else {
		System.out.println("Not Equal");////if memory loc is diff print not equal
	}
}
}
