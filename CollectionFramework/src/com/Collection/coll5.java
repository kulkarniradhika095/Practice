package com.Collection;

import java.util.ArrayList;

public class coll5 {
	
	public static void main(String[] args) {
		ArrayList set1 = new ArrayList();
		set1.add(10);
		set1.add(20);
		set1.add(30);
		set1.add(40);
		
		ArrayList set2 = new ArrayList();
		set2.add(10);
		set2.add(11);
		set2.add(20);
		set2.add(22);
		
		/*set1.addAll(set2);
		System.out.println("After Union: "+set1);
		
		set1.removeAll(set2);
		System.out.println("After Intersection: "+set1);
		System.out.println("After Intersection: "+set2);*/
		
		set1.retainAll(set2);
		System.out.println("After retaining: "+set1);
		System.out.println("Set 2: "+set2);
		
				
		}
}
