package com.jihe;

public class For_Foreach {
	static String[] strs= {"aaa","bbb","vvv"};
	public static void main(String[] args) {
		//用foreach来写，可以吗？
		for(String mgys:strs) {
			mgys="ddd";
		}
		System.out.println(strs[0]+" "+strs[1]+" "+strs[2]+" ");
		//用for循环来写，可以吗？
		for(int i=0;i<strs.length;i++) {
			strs[i]="ddd";
		}
		System.out.println(strs[0]+" "+strs[1]+" "+strs[2]+" ");
	}

}
