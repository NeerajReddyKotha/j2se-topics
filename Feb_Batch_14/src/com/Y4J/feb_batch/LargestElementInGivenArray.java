package com.Y4J.feb_batch;

public class LargestElementInGivenArray {

	public static void main(String[] args) {
		int arr []  = {7,10,25,27,29,6};
		int largest = arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			if(largest<arr[i])
				largest =arr[i];
		}
		System.out.println(largest);
	}

}

