package com.Y4J.feb_batch;

class Student1{
	int rollno;
	String Name;
	float fee;
	
	Student1(int r, String n, float f) {
		
		rollno = r; // assign the values to some other variable 
		Name = n;
		fee = f;
	}
	
	void display() {
		System.out.println("studentdata ="+ rollno+" "+Name+"  "+fee+" ");
	}
	
	
}

public class ThisKeyWordNotRequired {

	public static void main(String[] args) {
	 
		Student1 student = new Student1(111, "ram", 12);
		
		Student1 student1  = new Student1(0, null, 0);
   
		student.display();
		student1.display();
	} 

}

