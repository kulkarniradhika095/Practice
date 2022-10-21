package SetDemo;
/**
 * MethodsOfSortedSet
 * 
 */

import java.util.TreeSet;

public class MethodsOfSortedSet1 {
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
		
		System.out.println("Ascending order: "+ts);
		System.out.println("Smallest number: "+ts.first());
		System.out.println("Largest Element: "+ts.last());
		System.out.println("Elements less than 21: "+ts.headSet(21));//print elements less than 21
		System.out.println("Elements greater than equal to 21: "+ts.tailSet(21));//print elements greater than equal to 21
		System.out.println("less than or equal to passed element1 till passed element2: "+ts.subSet(21, 47));
	}
}
