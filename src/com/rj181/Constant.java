package com.rj181;

public class Constant {

	public static void main(String[] args) {
		// 字面上的整型常量198
		System.out.println("二进制以0b开头"+0b11000110);
		System.out.println("八进制以0开头"+0306);
		//0123456789abcdef
		System.out.println("十六进制以0x开头"+0xc6);
		
		//浮点数后面的f表示它是一个单精度浮点数
		System.out.println("5.022f="+5.022f);
		//浮点数后面的d表示它是一个双精度浮点数,这个d可以不写
		System.out.println("5.022="+5.022);
		System.out.println("5.022e+8d="+5.022e+8d);
		
		//字符型常量，Java中的字符都是Unicode编码(16位)，以\\u开头加4个16进制的值
		System.out.println("我的名字是"+'\u59dc'+'帆');
		
		//字符串常量
		System.out.println("Welcome,\nMonitor");
        //布尔常量
		System.out.println("布尔常量"+true+"或"+false);
		//null常量
		System.out.println("引用数据类型常量"+null);
		
		//基本数据类型的变量不能赋值为null
		int a=5;
	//	a=null;
		//引用数据类型的变量可以赋值为null
		Constant constant=new Constant();
		constant=null;
		//如果在类型的前面加上final关键字作为修饰符,那么被修饰的变量就成为常量
		//它不是字面意义的常量
		final int B=6;
		//b=7;
		
	}

}
