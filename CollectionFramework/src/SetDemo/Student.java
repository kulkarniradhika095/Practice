package SetDemo;
/**
 * If not made generic it will compare objects
 * @author radhi
 *
 */
public class Student implements Comparable<Student>{//make it generic so that it will compare student
	
	String name;
	float marks;
	float height;
	
	public Student(String name, float marks, float height) {
		this.name = name;
		this.marks = marks;
		this.height = height;
	}

	/*@Override
	public int compareTo(Student o) {
		Student s = o;
		if(this.marks<s.marks) {
			return-75;
		}else if(this.marks>s.marks) {
			return 33;
		}else
			return 0;
	}*/
	/*@Override
	public int compareTo(Student s) {
		return this.name.compareTo(s.name);
	}*/
	
	@Override
	public int compareTo(Student s) {
		if(this.marks< s.marks)
		return -5;
		else if(this.marks>s.marks) {
			return 4;
		}
			else
				return 0;
		}
	}
