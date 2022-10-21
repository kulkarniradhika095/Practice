package com.Collection;
/**
 * @author radhi
 * methods of Collection
 * 1. addAll --> union
 * 2. remove 
 * 3. removeAll --> common elements removed
 * 4. retainAll --> Uncommon elements are removed
 * 5. containsAll --> subset
 * 6. 
 * 7.
 * 8.
 * 9.
 * 10.
 * 11.
 */
import java.util.ArrayList;
import java.util.Stack;

public class coll4 {
	
	public static void main(String[] args) {
		ArrayList al  = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		
		Stack s = new Stack();
		s.addAll(al);//insert all elements in the stack of arrayList
		System.out.println(s);
		
		al.remove((Object)20);
		System.out.println("After removing: "+al);
		
	}
}
