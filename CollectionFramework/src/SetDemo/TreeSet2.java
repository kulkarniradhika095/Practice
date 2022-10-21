package SetDemo;

import java.util.TreeSet;

public class TreeSet2 {
	
	public static void main(String[] args) {
		Student lalita = new Student("lalita",76.89f,5.3f);
		Student aditi = new Student("aditi",91.23f,5.4f);
		Student divya = new Student("divya",84.47f,5.5f);
		Student geeta = new Student("geeta",79.01f,5.1f);
		Student hemant = new Student("hemant",93.76f,5.8f);
		
		
		TreeSet scholarship = new TreeSet();
		scholarship.add(10);//new Integer()
		scholarship.add(28);
		scholarship.add(31);
		scholarship.add(17);
		scholarship.add(8);
		
		System.out.println(scholarship);
}
}