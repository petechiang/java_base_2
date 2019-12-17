package com.rj181;

public class Odd_sum {

	public static void main(String[] args) {
		int sum=0;
		int i = 1;
		for (; i <100; i+=2) {
			sum+=i;
		}
		System.out.println("100以内奇数的和是"+sum);
	}

}
