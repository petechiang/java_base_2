package com.api;

import java.util.Random;

public class Random_test {

	public static void main(String[] args) {
		//求[0.0，1.0)之间的随机浮点数有两种方法
		//Math.random()<==>new Random().nextDouble()
		System.out.println("随机生成一个0到1之间double类型的浮点数"+Math.random());
		Random r=new Random();
		System.out.println("随机生成一个0到1之间double类型的浮点数"+r.nextDouble());
		
		System.out.println("随机生成int类型的整数"+r.nextInt());
		System.out.println("随机生成10以内int类型的整数"+r.nextInt(10));

	}

}
