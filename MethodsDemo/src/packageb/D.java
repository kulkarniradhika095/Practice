package packageb;
/**
 * Parameterized Constructor 
 * @author radhika kulkarni
 */
public class D {
		int i;//instance var
		
		
		public D(int x) {// parameterized constructor
			i=x;//initialization
			System.out.println("I am a constructor");
		}
		public static void main(String[] args) {
			System.out.println("I am main method");
			D b = new D(10);
			System.out.println("For Object 1: "+b.i);
			
			D b1 = new D(11);
			System.out.println("For Object 2: "+b1.i);
			
			D b2 = new D(12);
			System.out.println("For Object 3: "+b2.i);
	
		}
}
