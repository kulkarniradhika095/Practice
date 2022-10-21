package exceptionHandling;

public class excepHand3 {
	public static void main(String[] args) {
		int []x = {1,2,3,4,5};
		String S = "Hello";
		try {
			System.out.println(x[10]);
			System.out.println(S.charAt(1));
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("String Index Out Of Bounds Exception");
		} catch (Exception e) {
			System.out.println("Exception");
		}
	}
}
