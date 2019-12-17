package com.jihe;

import java.util.ArrayList;
import java.util.Iterator;

public class Diedai {

	public static void main(String[] args) {
		//ArrayList是集合类，后面<>里的String是集合里元素的类型
		ArrayList<String> list=new ArrayList<String>();
		list.add("s1");
		list.add("s2");
		list.add("s3");
		list.add("s4");
		//lambda表达式遍历集合里每个元素
		System.out.println("1:lambda表达式遍历集合里每个元素");
		list.forEach(duixiang->System.out.print(duixiang+" "));
		
		//通过迭代遍历集合里每个元素
		System.out.println("\n2:通过迭代遍历集合里每个元素");
		Iterator<String> diedai=list.iterator();
		//迭代对象有下一个元素吗
		while (diedai.hasNext()) {
			String mgys=(String) diedai.next();
			System.out.print(mgys+" ");
		}
		
		
		//针对迭代通过lambda表达式遍历集合里每个元素
		System.out.println("\n3:针对迭代通过lambda表达式遍历集合里每个元素");
		Iterator<String> it=list.iterator();
		it.forEachRemaining(duixiang->System.out.print(duixiang+" "));
		
		
		//通过foreach遍历集合里每个元素
		System.out.println("\n4:通过foreach遍历集合里每个元素");
		for(Object  dgys:list) {
			System.out.print((String)dgys+" ");
		}
	}

}
