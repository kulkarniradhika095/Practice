package packageb;
/**
 * This is a demo class
 * @author Radhika Kulkarni
 */

public class ClassE {
	public void add(byte a, byte b) {
		System.out.println("Adding Bytes:");

	}
	public void add(short a, short b) {
		System.out.println("Adding shorts:");

	}
	public void add(int a, int b) {
		System.out.println("Adding ints:");

	}
	public void add(long a, long b) {
		System.out.println("Adding Longs:");

	}
	public static void main(String[] args) {
		ClassE e = new ClassE ();  
		e.add((byte)5,(byte) 6);//to call byte method we have to do explicit typecasting
		e.add(5, 6);//numeric constants are by default considered as int
	}

}

