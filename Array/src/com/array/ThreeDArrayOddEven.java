package com.array;

public class ThreeDArrayOddEven {
		public static void main(String[] args) {
			int x[][][]= new int[][][]{{{1,2,3,4,5},{6,7,8,9},{10,11,12,13,14,15}}};
			System.out.println("Even Numbers: ");
			for (int i = 0; i < x.length; i++) {
				for (int j = 0; j < x[i].length; j++) {
					for(int k = 0; k < x[i][j].length; k++)
					if (x[i][j][k]%2 == 0) {
						System.out.print(x[i][j][k]+" ");
				}
				}
			}System.out.println();
			
			System.out.println("Odd Numbers: ");
			for (int i = 0; i < x.length; i++) {
				for (int j = 0; j < x[i].length; j++) {
					for(int k = 0; k < x[i][j].length; k++)
					if (x[i][j][k]%2 != 0) {
						System.out.print(x[i][j][k]+" ");
				}
				}
			}System.out.println();
		}
	}


