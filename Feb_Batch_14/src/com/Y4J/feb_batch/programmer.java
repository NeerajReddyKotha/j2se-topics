package com.Y4J.feb_batch;
class Employee{
	float salary = 20000; // non-static / instance variables
	
}
public class programmer extends Employee {
	int bounus = 10000; // non-static / instance variables
	public static void main(String[] args) {
		programmer pro = new programmer();
		System.out.println("programmer salary is"+pro.salary);
		System.out.println("programmer bonus is"+pro.bounus);
	}

}
