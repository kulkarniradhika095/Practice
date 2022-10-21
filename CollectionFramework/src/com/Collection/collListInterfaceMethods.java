package com.Collection;
/**
 * all methods of list interface
 * @author radhi
 */
import java.util.ArrayList;
import java.util.*;
public class collListInterfaceMethods {
	
	public static void main(String[] args) {
		ArrayList set1 = new ArrayList();
		set1.add(10);//0
		set1.add(20);//1
		set1.add(30);//2
		set1.add(40);//3
		set1.add(50);//4
		set1.add(40);//5
		
		
		ArrayList set2 = new ArrayList();
		set2.add(11);//0
		set2.add(21);//1
		set2.add(31);//2
		set2.add(41);//3
		set2.add(55);//4
		set2.add(44);//5
		
		set1.add(2,44);//added 44 to 2nd index --> right shift operation is performed.
		System.out.println("added to 2nd index and later right shift: "+set1);
		
		set1.remove(2);//44 is removed --> left shift operation is performed
		System.out.println("44 is removed --> left shift operation is performed: "+set1);
		
		
		System.out.println("first index of 40 is printed: "+set1.indexOf(40));//first index of 40 is printed
		
		System.out.println("last index of 40 is printed: "+set1.lastIndexOf(40)); //last index of 40 is printed
		
		System.out.println("from 2 to 4 that is before 5th index: "+set1.subList(2, 5)); //from 2 to 4 that is before 5th index, thus from-index is inclusive so it is considered but to-index is exclusive so it is not considered
		
		System.out.println("pass index and get element: "+set1.get(0));//pass index and get element
		
		set1.set(3, 45);//replace
		System.out.println("replace: "+set1);
		
		set1.addAll(3,set2);
		System.out.println("add from 3rd index: "+set1);
		
		
		
		
		
	}
}
