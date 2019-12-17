package com.rj181;

import java.io.IOException;
import java.io.InputStream;

public class Test3 {

	public static void main(String[] args) throws IOException {
		//自动类型转换：隐式类型转换 从小类型到大类型
		byte b=3;
		int i=b;
		System.out.println("整型变量i的值是"+i);
		
		//强制类型转换：显式类型转换 从大类型到小类型
		//()是强制类型转换符，小括号里面是要转换的数据类型
		int i2=257;
		byte b2=(byte)i2;
		System.out.println("整型变量i2的值是"+i2);
		System.out.println("字节型变量b2的值是"+b2);
		
		

	}

}
