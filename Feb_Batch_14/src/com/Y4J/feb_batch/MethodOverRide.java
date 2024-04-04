package com.Y4J.feb_batch;

class vehicle{
	void run() {
		System.out.println("veichle is running");
	}
}
public class MethodOverRide extends vehicle {
	void run () {
		System.out.println("bike is  running");
	}
	public static void main(String[] args) {
		MethodOverRide ride  = new MethodOverRide();
		ride.run();
	}

}
