package com.array;

public class ReverseOrderArray {
	public static void main(String[] args) {
		int [] x = new int[] {12,34,56,18,45,31};
		System.out.println("Array Elements in given order: ");
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i]+" ");
		}System.out.println();
		System.out.println("Array Elements in reverse order: ");
		for (int i = x.length-1; i >= 0; i--) {
			System.out.print(x[i]+" ");
		}
	}
}
