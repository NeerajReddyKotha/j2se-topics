package com.Y4J.feb_batch;

public class FactorArray {

	public static void main(String[] args) {
		int num  = 24;
		System.out.println("factors of "+num+"are");
		findFactor(num); // user defined method 
	}

	public static void findFactor(int num) {
		// method parameters
		int [] factors = new int[num];
		int count = 0;
		
		for (int i = 1; i <=num; i++) {
			if (num %i==0) {
				factors[count++]=i;
				
			}
			
		}
		for (int  i= 0;  i<count; ++i) {
			System.out.println(factors[i]);
		}
		
	}

}
