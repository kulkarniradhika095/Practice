package exceptionHandling;

public class excepHand1 {
	public static void main(String[] args) {
		int [] x = {0,1,2,3,4};
		try {
			System.out.println(x[5]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Indexes are finished..!");		
		}
	}
}
