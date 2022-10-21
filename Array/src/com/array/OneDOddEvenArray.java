package com.array;

public class OneDOddEvenArray {
public static void main(String[] args) {
	int x[] = {2,8,9,2,7,5};
	System.out.print("Even Numbers: ");
	for(int i = 0; i<x.length; i++){
		if(x[i]%2 == 0){
			System.out.print(x[i]+" ");
		}
	}System.out.println();
	System.out.print("Odd Numbers: ");
	for(int i = 0; i<x.length; i++){
		if(x[i]%2 != 0){
			System.out.print(x[i]+" ");
		}
	}System.out.println();
	
}

}

