package com.rj181;

public class Test {
	//构造方法重载
	public Test() {
		
		System.out.println("构造方法一被调用了");
	}
	public Test(int x) {
		//this关键字指代类本身
		this();
		System.out.println("构造方法二被调用了");
		
	}
	public Test(boolean b) {
	
		//this关键字指代类本身
		this(1);
		System.out.println("构造方法三被调用了");
	}
	public static void main(String[] args) {
		new Test(true);
	}

}
