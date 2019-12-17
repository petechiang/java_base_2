package com.jihe;

import java.util.ArrayList;
import java.util.Collections;

public class Collections_test {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<>();
		Collections.addAll(list, "周","李","郑","王");
		System.out.println("排序前："+list);
		//反转:reverse
		Collections.reverse(list);
		System.out.println("反转后："+list);
		//排序：sort 根据Java的字符编码：unicode编码的大小
		Collections.sort(list);
		System.out.println("排序后："+list);
		//随机排序：shuffle
		Collections.shuffle(list);
		System.out.println("随机排序后："+list);
		//首尾交换：swap
		Collections.swap(list,0,list.size()-1);
		System.out.println("首尾交换后："+list);
		//
		
	}

}
