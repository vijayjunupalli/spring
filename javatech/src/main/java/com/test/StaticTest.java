package com.test;

public class StaticTest {

	public static void main(String[] args) {
		
	int[] array= {1,3,5,3,4,6};
	
	for(int i=0;i<array.length;i++) {
		System.out.println(array[i]);
		
	}
		
	for(int a:array) {
		System.out.println("using for each loop "+a);
		
	}
		

	}
}