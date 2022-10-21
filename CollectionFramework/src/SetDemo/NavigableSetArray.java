package SetDemo;

import java.util.HashMap;
import java.util.TreeSet;

public class NavigableSetArray {
	
	public static void main(String[] args) {
		 int[]x = {21,19,16,18,21,15,13,21,12};//second largest number
		 
		 TreeSet ts = new TreeSet();
		 
		 for (int i = 0; i < x.length; i++) {
			ts.add(x[i]);
		}
		 System.out.println(ts);
		 System.out.println(ts.last());
		 System.out.println(ts.lower(ts.last()));
		 System.out.println(ts.higher(ts.first()));
		 
	}
}
