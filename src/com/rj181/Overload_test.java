package com.rj181;

public class Overload_test {
	public static void main(String[] args) {
		//如果一个方法是静态方法，可以直接用类名来引用
		System.out.println(Overload.add(3,5));
		System.out.println(Overload.add(3,5,6));
		//不管方法是不是静态的，都可以用对象名来引用
		Overload o1=new Overload();
		System.out.println(o1.add(3.1,5.2));

	}
}
