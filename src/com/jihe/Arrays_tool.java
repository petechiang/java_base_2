package com.jihe;

import java.util.Arrays;

public class Arrays_tool {

	public static void main(String[] args) {
		int arr[]= {9,8,3,5,2};
		System.out.print("排序前:");
		printArray(arr);
		System.out.println();
		Arrays.sort(arr);
		System.out.print("排序后:");
		printArray(arr);
		
		System.out.println();
		System.out.println("元素5的索引是"+Arrays.binarySearch(arr, 5));
		int[] copiedArr=Arrays.copyOfRange(arr, 1, 7);
		printArray(copiedArr);
	
		System.out.println();
		Arrays.fill(arr, 8);
		printArray(arr);
	}

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int j = arr[i];
			System.out.print(j+" ");
		}
		
	}

}
