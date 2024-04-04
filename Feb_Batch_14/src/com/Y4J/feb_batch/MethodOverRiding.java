package com.Y4J.feb_batch;

class vechile{ // parent 
	void run() {
		System.out.println("vechile is running");
	}
}
public class MethodOverRiding extends vechile{ // child 

	public static void main(String[] args) {
		MethodOverRiding method = new MethodOverRiding();
		
		method.run();

	}

}
