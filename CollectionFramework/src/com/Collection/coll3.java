package com.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Stack;

public class coll3 {
	
	public static void main(String[] args) {
		Collection c;
		Stack s = new Stack();
		s.add(10);
		s.add(11);
		s.add("Hello");
		s.add(13);
		s.add(14);
		s.add(15);
		s.add(16);
		s.add(12);
		s.add(14);
		s.add(true);
		s.add(3.14f);
		s.add(null);
		
		ArrayList al = new ArrayList(s);
		System.out.println(al);
	}
}
