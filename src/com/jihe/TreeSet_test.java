package com.jihe;

import java.util.TreeSet;

public class TreeSet_test {

	public static void main(String[] args) {
		TreeSet<Integer> ts=new TreeSet<Integer>();
		ts.add(15);
		ts.add(1);
		ts.add(25);
		ts.add(13);
		ts.add(17);
		ts.add(8);
		System.out.println("创建的TreeSet集合为"+ts);
		System.out.println("TreeSet第一个元素为"+ts.first());
		System.out.println("TreeSet最后一个元素为"+ts.last());
		System.out.println("TreeSet比9小或等于9的最大一个元素为"+ts.floor(9));
		System.out.println("TreeSet大于10的最小的一个元素为"+ts.higher(10));
		
		ts.pollLast();
		System.out.println("TreeSet集合删除最后一个元素后"+ts);
		
	}

}
