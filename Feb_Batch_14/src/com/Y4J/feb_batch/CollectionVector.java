package com.Y4J.feb_batch;

import java.util.Iterator;
import java.util.Vector;

public class CollectionVector {

	public static void main(String[] args) {
Vector<String> rohan  = new Vector<String>();
		
		rohan.add("arun");
		rohan.add("sharad");
		rohan.add("nagendra");
		rohan.add("swapnil");
		rohan.add("roopa");
		rohan.add("shiva");
		rohan.add("aditya");
		rohan.add("jitesh");
		rohan.add("haffezur");
		rohan.add("siddharthan");
	
		
		Iterator<String> ltr  = rohan.iterator();
       
		while (ltr.hasNext()) {
			System.out.println(ltr.next());			
		}
			
		}
		

	}


