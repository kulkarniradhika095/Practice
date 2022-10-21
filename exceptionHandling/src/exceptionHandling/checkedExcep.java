package exceptionHandling;
/**
 * At line no 12 => compile time exception is thrown by java
 * this is an example of Checked exception
 * @author radhi
 */
import java.io.FileInputStream;

public class checkedExcep {
	
	public static void main(String[] args) {
		FileInputStream fis = new FileInputStream("\"C:\\Users\\radhi\\Downloads\\Radhika V. Kulkarni Cover Letter.pdf\"");
	}
}
