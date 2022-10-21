package exceptionHandling;

public class excepHand2 {
	
	public static void main(String[] args) {
		int[]x = {1,2,3,4,5};
		String s = "Hello";
		try {
			System.out.println(x[5]);
			System.out.println(s.charAt(9));
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index is out of bound");
		}catch (StringIndexOutOfBoundsException e) {
			System.out.println("String Index is out of Bound");
		}
	}
}
