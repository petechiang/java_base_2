package com.api;

public class Baozhuanglei {

	public static void main(String[] args) {
		int a = 20;
		//自动装箱：将基本数据类型数据转成引用数据类型数据
		Integer b= a;
		//自动拆箱：将引用数据类型数据转成基本数据类型数据
		int c= b;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		//字符串转成整数的三种方法
		String s="88";
		String s1=s+10;
		System.out.println("字符串连接的结果是"+s1);
		System.out.print("No.1:通过包装类的静态valueOf方法:");
		int i_1=Integer.valueOf(s);
		System.out.print(i_1+10);
		System.out.print("\nNo.2:通过包装类的静态parseXXX方法:");
		int i_2=Integer.parseInt(s);
		System.out.print(i_2+10);
		System.out.print("\nNo.3:通过包装类的构造方法:");
		int i_3=new Integer(s);
		System.out.print(i_3+10);
		//整数转成字符串的三种方法
		Integer j=88;
		System.out.print("\n\nNo.1:通过String类的静态valueOf方法:");
		String s_1=String.valueOf(j);
		System.out.print(s_1);
		System.out.print("\nNo.2:通过包装类的toString方法:");
		String s_2=j.toString();
		System.out.print(s_2);
		System.out.print("\nNo.3:通过空串连接整数的方法:");
		String s_3=""+j;
		System.out.println(s_3);
		//20  Math.random()   [0.0,1.0)取整以后只能等于0
		System.out.println(20+(int)Math.random()*980);
		//(Math.random()*980)==[0.0-980.0) 取整以后只能等于0-979之间的整数
		System.out.println(20+(int)(Math.random()*980));
	}

}
