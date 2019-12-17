package com.jihe;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
class Mycomparator2 implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		String key1=(String)o1;
		String key2=(String)o2;
		return key2.compareTo(key1);
	}
	
}
public class TreeMap_test {
	
	public static void main(String[] args) {
		// 左边的类或接口必须比右边的类大或者相等
		Map<String,String> tm = new TreeMap<String,String>(new Mycomparator2());
		// map存储的元素是一个键key+值value=对entry
		tm.put("2", "Rose");
		tm.put("1", "Jack");
		tm.put("3", "Lucy");
		tm.put("1", "Jacky");
		System.out.println(tm);

	}

}
