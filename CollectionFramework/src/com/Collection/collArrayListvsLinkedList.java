package com.Collection;
/**
 * arrayList vs linkedList
 */
import java.util.ArrayList;
import java.util.LinkedList;

public class collArrayListvsLinkedList {
	
	public static void main(String[] args) {
		ArrayList set1 = new ArrayList();
		set1.add(10);//0
		set1.add(20);//1
		set1.add(30);//2
		set1.add(40);//3
		set1.add(50);//4
		set1.add(40);//5
		
		System.out.println("Array List: "+set1.get(3));
		
		LinkedList set2 = new LinkedList();
		set2.add(11);//0
		set2.add(21);//1
		set2.add(31);//2
		set2.add(41);//3
		set2.add(55);//4
		set2.add(44);//5
		
		System.out.println("Linked List: "+set2.get(3));
	}
}
