package exceptionHandling;

public class FinallyBlock {
	
	public static void main(String[] args) {
		int[]x = {1,2,3,4};
		try {
			
			System.out.println(x[10]);
			System.exit(0);//JVM shut down
		}catch (Exception e) {
			System.out.println("There is an exception");
			System.out.println(x[4]);
		}finally {
			System.exit(0);
			System.out.println("I am Finally");
		}
	}
}
