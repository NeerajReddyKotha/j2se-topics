package com.Y4J.feb_batch;

public class BitWiseVSLogicalOperator {

	public static void main(String[] args) {
		int a= 10;
		int b = 20;
		int c = 30;
		// logical AND
		System.out.println(a<b&&a<c); //TRUE &&  TRUE = TRUE
		//bitwise AND
		System.out.println(a<b&a<c); // TRUE & TRUE = TRUE 
		
		// logical OR
		System.out.println(a<b || a<c); 
		
		// bitwise OR
		System.out.println(a<b | a<c);
	}

}
