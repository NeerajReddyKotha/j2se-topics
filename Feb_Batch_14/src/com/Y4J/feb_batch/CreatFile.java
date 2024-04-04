package com.Y4J.feb_batch;

import java.io.File;
import java.io.IOException;

public class CreatFile {

	public static void main(String[] args) {
		try {
			File f = new File("E:fileoperations.txt");
			if(f.createNewFile()) {
				System.out.println("file"+f.getName()+"file ceated successfully");
			}else {
				System.out.println("file is already existed"); 
			
			}}
	        catch (IOException e) {
			System.out.println("an unexpected error occured");
			e.printStackTrace();
		}
		
		
		

	}
}
