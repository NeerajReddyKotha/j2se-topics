package com.Y4J.feb_batch;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a positive number"); 
		int number = scanner.nextInt();
		int reverse = 0;
		int temp = number;
		
		while (temp!=0) {
			int remainder = temp%10;
			reverse = reverse*10+remainder;
			
			temp = temp/10;
				
		}
		if (reverse==number) {
			System.out.println("its a palindrome");
		}else {
			System.out.println("not a palindrome");
		}
	}

	}


