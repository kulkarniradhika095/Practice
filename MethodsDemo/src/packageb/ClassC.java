// method and returnTypes

package packageb;

import packagea.ClassA;//default class example

public class ClassC {
	
	protected int x = 10;//Instance-->Default
	static int y = 20;//static
	
	public int returnInt() {
		return 10;
	}
	
	public byte returnbyte() {
		byte b = 10;
		return b;
	}
	
	public short returnshort() {
		short s =10;
		return s;
		}
	
	public int[] returnarray() {
		int[] x = {1,2,3,4};
		return x;
	}
	
	public int[][] returnArray() {
		int [][] x = {{1,2,3,4},{4,5}};
		return x;
	}
	public int returnAdd(int a, int b) {
		return a+b;

	}
	public static void main(String[] args) {
				
		ClassC c = new ClassC();
		System.out.println("Hello");
		System.out.println(c.returnAdd('A', 'B'));
	
}
}
//ideal coding practice= only one main method in one public class, 
//not to make make many default classes/ multiple classes==> as multiple ".class" files will be made w r to no of classes made in the program
