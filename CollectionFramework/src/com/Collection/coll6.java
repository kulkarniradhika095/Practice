package com.Collection;

import java.util.ArrayList;

/**
 * Print common element of arrays given using collection
 * @author radhi
 */
public class coll6 {
	
	public static void main(String[] args) {
		int[] x = {10,11,20,33,46,34};
		int[] y = {17,11,23,38,34,46};
		
		//normal zindagi
		for (int i = 0; i < x.length; i++) {
			int count = 0;
			for (int j = 0; j < y.length; j++) {
				if (x[i]==y[j]) {
					count++;
				}
					
			}
			if (count>0) {
				System.out.println(x[i]+" ");
			}
			
		}
		//mentos zindagi
		
		ArrayList ax = new ArrayList();
		ArrayList ay = new ArrayList();
		for (int i = 0; i < x.length; i++) {
			ax.add(x[i]);
		}
		for (int i = 0; i < x.length; i++) {
			ay.add(y[i]);
		}
		ax.retainAll(ay);
		System.out.println("Common elements are: "+ax);
	}
	
}
