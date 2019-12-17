package com.jihe;

import java.util.ArrayList;
import java.util.HashSet;

public class Set_test {

	public static void main(String[] args) {
		ArrayList<String> arrayList=new ArrayList<String>();
		arrayList.add("Mike");
		arrayList.add("Eva");
		arrayList.add("Rose");
		arrayList.add("Rose");
		System.out.println(arrayList);
		
		//无法向HashSet中插入重复元素,并且按照字母顺序排好
		//没有重复是因为集合里String类重写了hashCode方法和equals方法
		//没有重复是因为集合里Integer类重写了hashCode方法和equals方法
		//按照字母顺序排好是因为集合里String类重写了CompareTo方法
		//按照字母顺序排好是因为集合里Integer类重写了CompareTo方法
		HashSet<Integer> hSet=new HashSet<Integer>();
		hSet.add(5);
		hSet.add(6);
		hSet.add(6);
		hSet.add(1);
		System.out.println(hSet);
	}

}
