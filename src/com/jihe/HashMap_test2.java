package com.jihe;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class HashMap_test2 {

	public static void main(String[] args) {
		// 左边的类或接口必须比右边的类大或者相等
		Map<String,String> hm = new LinkedHashMap<String,String>();
		// map存储的元素是一个键key+值value=对entry
		hm.put("2", "Rose");
		hm.put("1", "Jack");
		hm.put("3", "Lucy");
		hm.put("1", "Jacky");
		System.out.println(hm);
		System.out.println("遍历键集输出");
		Set<String> jianji = hm.keySet();
		Iterator<String> diedai = jianji.iterator();
		while (diedai.hasNext()) {
			Object key = (Object) diedai.next();
			Object value = hm.get(key);
			System.out.println(key + ":" + value);
		}
		
		System.out.println("遍历键值对输出");
		Set<Map.Entry<String,String>> jianzhidui = hm.entrySet();
		Iterator<Map.Entry<String,String>> diedai2 = jianzhidui.iterator();
		while (diedai2.hasNext()) {
			Map.Entry<String,String> key_value = (Map.Entry<String,String>) diedai2.next();
			Object key=key_value.getKey();
			Object value = key_value.getValue();
			System.out.println(key + ":" + value);
		}
		
		System.out.println("foreach遍历集合输出");
		//等价于第29-第35行代码
		hm.forEach((key,value)->System.out.println(key + ":" + value));
		
		System.out.println("foreach遍历值输出");
		Collection<String>  zhiji=hm.values();
		zhiji.forEach(zhi->System.out.println(zhi));
	}

}
