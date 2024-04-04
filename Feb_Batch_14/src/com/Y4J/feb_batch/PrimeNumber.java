package com.Y4J.feb_batch;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a positve number");
		 int number = scanner.nextInt();
		
		
		if (isPrime(number)) {
			System.out.println(number + "is prime");
		}else {
			System.out.println(number+ "is not prime");
		}

	}
   // function to check if a number is prime 
	 static boolean isPrime(int number) {
		 
		if (number <=1) {
			return false;  // number is less than or equal to 1 are not prime 
		}
		for (int i = 2; i < Math.sqrt(number); i++) {
			if (number% i == 0) {
				return false; 
				
			}
			
		}
		return true;
		
	}
}

	
