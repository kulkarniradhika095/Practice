package SetDemo;
/**
 * elements should be homogeneous and comparable
 * java generic--> using angular brackets
 */
import java.util.TreeSet;

public class HomoAndComparable {
	
	public static void main(String[] args) {
		Student lalita = new Student("lalita",76.89f,5.3f);
		Student aditi = new Student("aditi",91.23f,5.4f);
		Student divya = new Student("divya",84.47f,5.5f);
		Student geeta = new Student("geeta",79.01f,5.1f);
		Student hemant = new Student("hemant",93.76f,5.8f);
		
		TreeSet<Student> ts = new TreeSet();
		//Homogeneous elements yet again class cast exception 
		ts.add(aditi);//new Object()
		ts.add(divya);
		ts.add(lalita);
		ts.add(geeta);
		ts.add(hemant);
		//java generic
		for(Student student: ts) {
			System.out.println(student.name);//wrt marks lesser to higher-->ascending order
		}
		
	}
}
