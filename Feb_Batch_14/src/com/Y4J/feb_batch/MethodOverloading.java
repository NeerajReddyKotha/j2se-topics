package com.Y4J.feb_batch;
class Addition{
	static int add(int a,int  b) {
		return a+b;
	}
	 static double add(int a, double b,int c) {
		return a+b+c;
		
	}
		
	}

public class MethodOverloading {
public static void main(String[] args) {
	System.out.println(Addition.add(10, 0));
	System.out.println(Addition.add(12, 1,1));
}
}
