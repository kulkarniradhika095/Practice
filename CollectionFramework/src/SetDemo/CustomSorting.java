package SetDemo;
/**
 * Comparator and comparator can be used for custom-sorting order that is both ascending as well as descending


 */
import java.util.TreeSet;

public class CustomSorting {
	
	public static void main(String[] args) {
		Student lalita = new Student("lalita",76.89f,5.3f);
		Student aditi = new Student("aditi",91.23f,5.4f);
		Student divya = new Student("divya",84.47f,5.5f);
		Student geeta = new Student("geeta",79.01f,5.1f);
		Student hemant = new Student("hemant",93.76f,5.8f);
		
		
		TreeSet<Student> scholarship = new TreeSet(new MarksComparator());//Comparison w r to comparator
		scholarship.add(lalita);//new Byte()
		scholarship.add(hemant);
		scholarship.add(aditi);
		scholarship.add(divya);
		scholarship.add(geeta);
		

		TreeSet<Student> ncc = new TreeSet(new NCCComparator());
		ncc.add(hemant);//new Byte()
		ncc.add(lalita);
		ncc.add(aditi);
		ncc.add(divya);
		ncc.add(geeta);
		
		System.out.println("Sorting of Students w r to Marks: ");
		for(Student student: scholarship) {
			System.out.print(student.name+" ");
		}System.out.println();
		System.out.println("----------------------------------");
		System.out.println("Sorting of Students w r to height: ");
		for(Student student: ncc) {
			System.out.print(student.name+" ");
		}
}
}
