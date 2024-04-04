package com.Y4J.feb_batch;

public class ThisKeyWord {
	int id;
	String Name; // non-static variables 
	float fee;
	

	public ThisKeyWord(int id, String name, float fee) {
		this.id = id;
		Name = name; // local variable 
		this.fee = fee;
	}
	
	void display() {
		System.out.println(id+" "+Name+" "+fee+" ");
	}

   
	public static void main(String[] args) {
		ThisKeyWord t = new ThisKeyWord(1, "neeraj", 2);
		
		ThisKeyWord t1 = new ThisKeyWord(0, null, 0);
		
		// t and t1 are reference variables which used to call display method 
		
	t.display();
	t1.display();
	
	
		

	}

}
