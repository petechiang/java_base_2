package com.api;

public class System_arraycopy {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int b[]= {5,62,738,849,95};
		System.arraycopy(a, 2, b, 0, 3);
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]+",");
		}
	}

}
