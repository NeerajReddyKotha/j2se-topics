package com.Y4J.feb_batch;

import java.io.FileWriter;
import java.io.IOException;

public class WriteintoFile {
	public static void main(String[] args) {
		try {
			FileWriter f = new FileWriter("E:fileoperartions.txt");
			f.write("students are good and class is going fine");
			f.close();
			System.out.println("data inserted sucessfully");
		} catch (IOException e) {
			System.out.println("error occured");
			e.printStackTrace();
		}
	}
}
