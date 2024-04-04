package com.Y4J.feb_batch;

import java.util.Arrays;

public class SecondLargest {
	public static void main(String[] args) {
		int arr []  = {7,10,25,27,29,6};
		Arrays.sort(arr);
		int secondlargest  = arr[arr.length-2];
		System.out.println(secondlargest);
	}

}