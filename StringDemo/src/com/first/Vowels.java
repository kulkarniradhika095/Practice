package com.first;

import java.util.Scanner;

/**
 * Vowels
 * @author radhi
 *
 */
public class Vowels {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		System.out.println("Enter a String: ");
		String s = sc.nextLine();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i)=='a'|| s.charAt(i)=='e'|| s.charAt(i)=='i'|| s.charAt(i)=='o'|| s.charAt(i)=='u') {
				System.out.print(s.charAt(i)+" ");
				count++;
			}
		}System.out.println("There are "+count+" Vowels in a String");
	}
}
