package com.first;

import java.util.Scanner;

/**
 * Length Method
 * @author radhi
 *
 */
public class Seven {
	public static void main(String[] args) {
		System.out.println("Enter a string: ");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println("There are "+s.length()+ " Characters in the string!");
		
		}
}
