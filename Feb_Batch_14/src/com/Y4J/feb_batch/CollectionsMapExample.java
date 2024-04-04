package com.Y4J.feb_batch;

import java.util.HashMap;
import java.util.Map;

public class CollectionsMapExample {

	public static void main(String[] args) {
Map<String,Integer> Studentscores = new HashMap<>();
		
		Studentscores.put("ramesh", 95);
		Studentscores.put("ramesh1", 90);
		Studentscores.put("ramesh2", 89);
		
		

		System.out.println("ramesh:"+ Studentscores.get("ramesh2"));
		
		
		String StudentName  = "neeraj";
		 
		if (Studentscores.containsKey(StudentName)) {
			System.out.println(StudentName+"score"+Studentscores.get(StudentName));
			
		}else {
			System.out.println("not found in the above record");
		}
		
		System.out.println("all the studentrs data");
		for(Map.Entry<String,Integer> entry : Studentscores.entrySet()) {
			System.out.println(entry.getKey()+"     "+entry.getValue());
		}
	}

}
