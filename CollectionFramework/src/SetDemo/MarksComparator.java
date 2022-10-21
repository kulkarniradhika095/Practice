package SetDemo;

import java.util.Comparator;

public class MarksComparator implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		if (s1.marks<s2.marks) {
			return 8;//+ve
		} else if(s1.marks>s2.marks){
			return -10;//-ve
		}else
			return 0;
	}

}
