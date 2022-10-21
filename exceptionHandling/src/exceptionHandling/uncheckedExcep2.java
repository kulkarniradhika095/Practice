package exceptionHandling;
/**
 * At runTime Program will be terminated at  line no: 10
 * @author radhi
 *
 */
public class uncheckedExcep2 {
	public static void main(String[] args) {
		int[] a= {1,2,3,4};
		System.out.println(a[4]); //arrayIndexOutOfBoundException => It is an unchecked exception
		System.out.println("Continue"); //runTime exception => Class file is created as it is not compileTime / checked exception
	}
}
