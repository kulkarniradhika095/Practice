package com.Collection;
/**
 * stack methods
 * @author radhi
 */
import java.util.Stack;
import java.util.Vector;

/**
 * stack --> child class of vector class
 * @author radhi
 */
public class collStack {
	
	public static void main(String[] args) {
		Stack set1 = new Stack();
		set1.push(10);
		set1.push(20);
		set1.push(30);
		set1.push(40);
		set1.push(50);
		System.out.println("After Push Operation: "+set1);//Print all the stack elements
		
		int s = set1.search(30);
		System.out.println("After Search Operation: "+s);//search the destination of stack element
		
		Object c = set1.pop();
		System.out.println("After pop operation: "+c);//print the element on top(remove and return to the--> [10,20,30,40])
		
		Object d = set1.peek();
		System.out.println("After Peek Operation: "+d);//print the element on top that is 40--> after pop operation
		
		
	}

}
