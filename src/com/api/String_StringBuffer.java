package com.api;

public class String_StringBuffer {

	public static void main(String[] args) {
		String s1=new String("abc");
		String s2=new String("abc");
		if (s1.equals(s2)) {
			System.out.println("s1和s2相等");
		}
		StringBuffer sb1=new StringBuffer("abc");
		StringBuffer sb2=new StringBuffer("abc");
		if (!sb1.equals(sb2)) {
			System.out.println("sb1和sb2不相等");
		}
		

	}

}
//String类的值是不可更改的，一旦定义，除非回收，永远都是一样的
//StringBuffer类和StringBuilder的值都是可以更改的，第一次赋值以后可以进行修改
//StringBuffer类上线程安全的，但是性能较低
//StringBuilder类上线程不安全的，但是性能较高