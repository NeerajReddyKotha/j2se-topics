package com.Y4J.feb_batch;

public class StudentRecordExample {
 int id;
 String Name;
 
	StudentRecordExample(int i, String n) {
	
	id = i;
	Name = n;
}
	 void display() {
		 System.out.println(id+" "+Name);
	 }

	public static void main(String[] args) {
		// create and object and pass values 
		StudentRecordExample s1 = new StudentRecordExample(1, "neeraj");
		StudentRecordExample s2 = new StudentRecordExample(2, "neeraj1");
		// calling the display method using reference variable 
		s1.display();
		s2.display();

	}

}
