package SetDemo;

import java.util.Comparator;
import java.util.SortedSet;

public class NCCComparator implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		if(s1.height>s2.height) {
			return -1;
		}else if (s1.height<s2.height){
			return 2;
		}else
		return 0;
	}
	
	SortedSet s;

}
