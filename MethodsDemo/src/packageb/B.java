package packageb;
/**
 * This is a constructor to method conversion class
 * @author radhika kulkarni
 */

public class B {
	int i;
	char c;
	
	public void B() {// constructor became method as return-type is introduced
		System.out.println("I am a constructor");
	}
	public static void main(String[] args) {
		System.out.println("I am main method");
		B b = new B();//jvm constructor so method is not called
		B c = new B();
		System.out.println(b.c);
		System.out.println(c.i);
		
	}
}
