package com.rj181;

public class Fibonacci {
	public static int F(int n) {
		//F(1)=1，F(2)=1
		//return语句在方法中执行以后，方法将终止，不再执行return后面的语句
		if(n==1) return 1;
		
		if(n==2) return 1;
		
		// F(n)=F(n-1)+F(n-2)
		return F(n-1)+F(n-2);
		
	}
	public static void main(String[] args) {
		//1,1,2,3,5
		System.out.println("Fibonacci sequence的第50个数是"+F(50));
	}

}
