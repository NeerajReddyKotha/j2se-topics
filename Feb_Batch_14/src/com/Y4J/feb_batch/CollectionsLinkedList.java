package com.Y4J.feb_batch;

import java.util.Iterator;
import java.util.LinkedList;

public class CollectionsLinkedList {

	public static void main(String[] args) {
LinkedList<Integer> al  = new LinkedList<>();
		
		al.add(12);
		al.add(13);
		al.add(14);
		al.add(13);
		al.add(14);
		
		
		
		Iterator<Integer> itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		
		

	}

}
