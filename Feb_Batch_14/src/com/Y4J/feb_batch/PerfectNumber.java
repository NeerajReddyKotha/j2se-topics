package com.Y4J.feb_batch;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a positive number");
		
		int number = scanner.nextInt(); 
		
		int sum = 0;
		
		for (int i = 1; i <number; i++) {
		if (number%i == 0) { // IF(ARR[I] % I == 0
			sum   = sum +i;
			
		}	
		
			
		}
		if (sum == number) {
			 System.out.println(number + "it is perfect number");
			
		}else {
			System.out.println(number+"not a perfrct number");
		}
		
		
	}
	}


