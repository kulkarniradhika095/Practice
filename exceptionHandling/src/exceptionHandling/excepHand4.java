package exceptionHandling;
/**
 * O/p is not correct
 * @author radhi
 */
import java.io.FileInputStream;

public class excepHand4 {
	
	public static void main(String[] args) {
		int[]x = {1,2,3,4,5};
		String s = "Hello";
		try {
			System.out.println(x[3]);
			System.out.println(s.charAt(3));
			FileInputStream fis = new FileInputStream("\"C:\\Users\\radhi\\Downloads\\Scan 14 Jun 2022_1.jpg\"");
		} catch (Exception e) {
			System.out.println("Array Index out of bounds");
			System.out.println("String Index out of bounds");
		}
	}
}
