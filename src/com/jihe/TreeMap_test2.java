package com.jihe;


import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap_test2 {

	public static void main(String[] args) {
		// 左边的类或接口必须比右边的类大或者相等
		Map<String,String> tm = new TreeMap<String,String>();
		// map存储的元素是一个键key+值value=对entry
		tm.put("4", "Amiee");
		tm.put("2", "John");
		tm.put("3", "Smith");
		tm.put("1", "Luch");
		tm.put("5", "Amanda");
		System.out.println(tm);
		Set<String> jianji = tm.keySet();
		Iterator<String> diedai = jianji.iterator();
		while (diedai.hasNext()) {
			Object key = (Object) diedai.next();
			Object value = tm.get(key);
			System.out.println(key + ":" + value);
		}
	}

}
