package com.api;

import java.util.ArrayList;
import java.util.LinkedList;

public class Collection_test {

	public static void main(String[] args) {
		//<>表示泛型，也就是集合里元素的类型
		ArrayList<String> list=new ArrayList<String>();
		list.add("s1");
		list.add("s2");
		list.add("s3");
		list.add("s4");
		System.out.println("集合长度是"+list.size());
		System.out.println("第二个元素是"+list.get(1));
		
		
		LinkedList<String> list2=new LinkedList<String>();
		list2.add("s1");
		list2.add("s2");
		System.out.println(list2);
		list2.offer("offer");
		list2.push("push");
		System.out.println(list2);
		System.out.println("第一个元素是"+list2.get(0));
		System.out.println("第一个元素是"+list2.peek());
		list2.removeFirst();
		list2.pollLast();
		System.out.println(list2);

	}

}
