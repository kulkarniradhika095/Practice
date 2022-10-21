package SetDemo;

import java.util.TreeSet;

public class MethodsOfNavigableSet1 {
	
		public static void main(String[] args) {
			TreeSet ts = new TreeSet();
			ts.add(13);
			ts.add(46);
			ts.add(12);
			ts.add(21);
			ts.add(8);
			ts.add(32);
			ts.add(26);
			ts.add(76);
			
			System.out.println("Returns the least element in this set strictly greater than the given element: "+ts.higher(21));
			System.out.println("Returns the greatest element in this set strictly less than the given element: "+ts.lower(21));
			System.out.println("Returns the greatest element in this set less than or equal to the given element: "+ts.floor(21));
			System.out.println("Returns the least element in this set greater than or equal to the given element: "+ts.ceiling(31));
	
		
	}
}
