package com.Collection;
/**
 * Vector
 * @author radhi
 */
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

/**
 * Vector
 * @author radhi
 */
public class collVector {
	public static void main(String[] args) {
		Vector set1 = new Vector();
		set1.add(10);//0
		set1.add(20);//1
		set1.add(30);//2
		set1.add(40);//3
		set1.add(50);//4
		set1.add(40);//5
		
		System.out.println("Before Increment: "+set1.capacity());
		
		set1.add(41);
		set1.add(42);
		set1.add(43);
		set1.add(44);
		set1.add(45);
		set1.add(46);
		set1.add(47);
		
		System.out.println("After Increment: "+set1.capacity());
	}
}
