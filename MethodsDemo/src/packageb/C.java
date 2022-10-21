package packageb;
/**
 * No-Argument constructor
 * This is a constructor used to initialize instance variable in the class
 * @author radhika kulkarni
 */
public class C {
		int i=10;//instance var
		char c='B';//instance var
		
		public C() {// constructor by programmer without parameter/arguments
			System.out.println("I am a constructor");
		}
		public static void main(String[] args) {
			System.out.println("I am main method");
			C b = new C();//constructor is called
			System.out.println(b.i);
			System.out.println(b.c);
			
		}
	}


