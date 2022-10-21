package com.first;
/**
 * indexOf(char ch): first occurance index of specified character
 * lastIndexOf(char ch): last occurance index of specified character
 * trim(): String 
 * split(String regex): String[]
 * @author radhi
 */
import java.util.Scanner;

public class Twelve {
	public static void main(String[] args) {
		String s = "hello Testing Shastra";
		System.out.println(s.indexOf('s'));
		System.out.println(s.lastIndexOf('e'));
		//System.out.println("Before trimming: "+s);
		//System.out.println("After trimming: "+s.trim());
		String[] parts = s.split("Testing");
	//	System.out.println("There are "+parts.length+" words in a string!");
		for (String part : parts) {
			System.out.println(part);
		}
	}
}
