package packageb;

/**
 * This is a constructor class for making object
 * @author radhika kulkarni
 */
public class A {
	//programmer constructor as there is no return-type
	public A() {
		System.out.println("I am a constructor");
	}
	public static void main(String[] args) {
		A a = new A();
		A a1 = new A();	
	}
}
