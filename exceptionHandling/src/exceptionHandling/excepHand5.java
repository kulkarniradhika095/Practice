package exceptionHandling;

import java.io.FileNotFoundException;

/**
 * @author supriya
 * Use of 'throws' keyword
 */
public class excepHand5 {
	
	public void m1 () throws FileNotFoundException{
		int[]x = {1,2,3,4};
		System.out.println(x[6]);
	}
	public static void main(String[] args) {
		try {
		
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index out of bound");
		}
	}
}
