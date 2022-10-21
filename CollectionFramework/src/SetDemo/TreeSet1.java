package SetDemo;
/**
 * Treeset
 */
import java.util.TreeSet;

public class TreeSet1 {
	
	public static void main(String[] args) {
		Student lalita = new Student("lalita",76.89f,5.3f);
		Student aditi = new Student("aditi",91.23f,5.4f);
		Student divya = new Student("divya",84.47f,5.5f);
		Student geeta = new Student("geeta",79.01f,5.1f);
		Student hemant = new Student("hemant",93.76f,5.8f);
		
		TreeSet ts = new TreeSet();
		
		ts.add(31);
		ts.add(14);
		ts.add(29);
		ts.add(13);
		ts.add(18);
		ts.add(12);
		ts.add("hi"); //compile time error --> ClassCastException
		System.out.println(ts);
	}
}
