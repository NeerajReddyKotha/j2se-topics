package com.Y4J.feb_batch;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionsArrayList {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("rachana");
		list.add("srikanth");
		list.add("ramesh");
		
		
		Iterator itr = list.iterator();
	 while (itr.hasNext()) {
		 System.out.println(itr.next());
		
		
	}

	}

}
