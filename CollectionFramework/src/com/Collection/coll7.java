package com.Collection;

import java.util.ArrayList;

public class coll7 {
	
	public static void main(String[] args) {
		ArrayList set1 = new ArrayList();
		set1.add(10);
		set1.add(20);
		set1.add(30);
		set1.add(40);
		
		ArrayList set2 = new ArrayList();
		set2.add(10);
		//set2.add(11);
		set2.add(20);
		//set2.add(22);
		
		
		boolean b = set1.containsAll(set2);
		System.out.println(b);
	}
}
