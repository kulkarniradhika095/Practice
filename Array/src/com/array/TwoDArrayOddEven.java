package com.array;

public class TwoDArrayOddEven {
	public static void main(String[] args) {
		int x[][]= new int[][]{{1,2,3,4,5},{6,7,8,9}};
		System.out.println("Even Numbers: ");
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				if (x[i][j]%2 == 0) {
					System.out.print(x[i][j]+" ");
			}
			}
		}System.out.println();
		System.out.println("Odd Numbers: ");
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				if (x[i][j]%2 != 0) {
					System.out.print(x[i][j]+" ");
			}
			}
		}System.out.println();
		
	}
}
