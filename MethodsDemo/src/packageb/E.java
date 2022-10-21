package packageb;
/**
 * Super class--parent class constructor
 * @author radhika Kulkarni
 */

public class E {
	int i;

	public E() {
		//every constructor's 1st line/ 1st default command is call to super class constructor
		//parent/super class constructor is called using a keyword--> 'super'
		//as soon as the constructor is called the class of same object is made
		//super class of every class in java is --> object class
		//'super' keyword is used to call--> 1)variables 2)methods 3)constructor
		super();
	}
	public static void main(String[] args) {
		E e = new E();
		System.out.println(e.toString());//method is being called using object class
	}
}
