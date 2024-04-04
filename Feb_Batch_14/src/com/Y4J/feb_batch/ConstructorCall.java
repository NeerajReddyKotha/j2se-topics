package com.Y4J.feb_batch;

class Student2{
	int rollno;
	String Name,course;
	float fee;
	

	public Student2(int rollno, String name, float fee) {
		super();
		this.rollno = rollno;
		Name = name;
		this.fee = fee;
	}


	public Student2(int rollno, String name, String course, float fee) {
		this.course = course;
	
	}
	void display() {
		System.out.println(rollno+" "+Name+""+course+""+fee);
	}
	
	
	
	
}

public class ConstructorCall {
public static void main(String[] args) {
	Student2 S  = new Student2(0, null, 0);
	
	S.display();
}
}
