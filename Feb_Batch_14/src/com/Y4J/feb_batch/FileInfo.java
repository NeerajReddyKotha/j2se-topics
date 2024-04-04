package com.Y4J.feb_batch;

import java.io.File;

public class FileInfo {

	public static void main(String[] args) {
		File f = new File("E:fileoperations.txt");
		if (f.exists()) {
			System.out.println("filename:"+f.getName());
			
			System.out.println("the path"+f.getAbsolutePath());
			
			System.out.println("writable?"+f.canWrite());
			
			System.out.println("readble?"+f.canRead());
			
			System.out.println("the size of the file"+f.length());
		}else {
			System.out.println("no file exists");
		}
		

	}

}
