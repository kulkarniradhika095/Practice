package exceptionHandling;
/**
 * .class file is created
 * At line no: 11 unchecked exception has occured => String index out of bound exception
 * @author radhi
 *
 */
public class uncheckedExcep1 {
	public static void main(String[] args) {
	String s = "Hello";
	System.out.println(s.charAt(5));//String index out of bound exception
	System.out.println("Continue");
}
}
