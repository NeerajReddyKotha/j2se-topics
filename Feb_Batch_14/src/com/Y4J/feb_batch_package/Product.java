package com.Y4J.feb_batch_package;

public class Product {
	int id;
	String Name; //non static variables
	public float price;
	public Product(int id, String name, float price) {
		
		this.id = id;
		Name = name; 
		this.price = price;
	}
}
