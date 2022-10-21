package com.stringBuffer;
/**
 * String class is immutable
 * StringBuffer class is mutable
 * @author radhi
 *
 */
public class First {
	
	public static void main(String[] args) {
		String s = new String("Hello");//String
		s.concat("Testing Shastra");
		System.out.println("Using String: "+s);
		
		StringBuffer sb =  new StringBuffer("Hello");//StringBuffer
		sb.append(" Testing Shastra");
		System.out.println("Using StringBuffer: "+sb);
	}
}
