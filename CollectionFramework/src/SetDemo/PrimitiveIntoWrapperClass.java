package SetDemo;

import java.util.Arrays;
import java.util.List;

public class PrimitiveIntoWrapperClass {
	public static void main(String[] args) {
		Integer[]x = {1,2,3,4,5}; //int became Integer(primitive data type converted into wrapper class)
		List list = Arrays.asList(x);
		System.out.println(list);
	}
}
