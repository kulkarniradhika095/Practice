package com.Collection;

import java.util.ArrayList;

/**
 * copy+paste shortcut==> Alt+Ctrl+downward arrow key
 * arrayList
 * @author radhi
 */
public class coll2 {
	
	public static void main(String[] args) {
		ArrayList al = new ArrayList();//default capacity is 10, but at runtime it is growable
		al.add(10);
		al.add(11);
		al.add(12);
		al.add(13);
		al.add(14);
		al.add(15);
		al.add(16);
		al.add(16);
		al.add(16);
		al.add(16);
		al.add(true);
		al.add(3.14f);
		al.add("Hello");
		al.add(16);
		System.out.println(al);
	}
}
