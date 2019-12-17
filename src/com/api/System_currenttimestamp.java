package com.api;
//获取时间戳：系统时间离开1970年1月1日午夜零点的毫秒数
public class System_currenttimestamp {

	public static void main(String[] args) {
		long kssj=System.currentTimeMillis();
		long sum=0;
		for (long i = 0; i < 10000000000l; i++) {
			sum+=i;
		}
		long jssj=System.currentTimeMillis();
		System.out.println("从1加到100亿耗时"+(jssj-kssj)+"毫秒");
	}

}
