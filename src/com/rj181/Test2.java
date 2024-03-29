package com.rj181;



public class Test2 {
	public static void main(String[] args) {
		byte b=1;  //00000001
		short s=1; //00000000 00000001
		int i=1;    //00000000 00000000 00000000 00000001
		long l=1l;  //00000000 00000000 00000000 00000000 00000000 00000000 00000000 00000001
		
		float f=1.0f;//表示单精度的1.0，后面一定要写f
		double d=1.0;//1.0默认用64位的double类型来表示
		
		char c='a';//字符型常量用单引号括起来
		short sc=97;
		char cc=97;
		
		boolean b1=true;
		boolean b2=false;
		
		System.out.println(c);
		System.out.println((char)sc);
		System.out.println(cc);
		
		System.out.println("字节型整型数据的长度是"+Byte.SIZE);
		System.out.println("短整型整型数据的长度是"+Short.SIZE);
		System.out.println("整型数据的长度是"+Integer.SIZE);
		System.out.println("长整型整型数据的长度是"+Long.SIZE);
		System.out.println("单精度浮点型数据的长度是"+Float.SIZE);
		System.out.println("双精度浮点型数据的长度是"+Double.SIZE);
		System.out.println("字符型数据的长度是"+Character.SIZE);
		
		System.out.println("字节型整型数据的取值范围是"+Byte.MIN_VALUE+"-"+Byte.MAX_VALUE);
		System.out.println("短整型整型数据的取值范围是"+Short.MIN_VALUE+"-"+Short.MAX_VALUE);
		System.out.println("整型数据的取值范围是"+Integer.MIN_VALUE+"-"+Integer.MAX_VALUE);
		System.out.println("长整型整型数据的取值范围是"+Long.MIN_VALUE+"-"+Long.MAX_VALUE);
		System.out.println("单精度浮点型数据的取值范围是"+Float.MIN_VALUE+"-"+Float.MAX_VALUE);
		//1.4*10^-45  -  3.4028235*10^38
		//-3.4028235*10^38  -  -1.4*10^-45
		
		System.out.println("双精度浮点型数据的取值范围是"+Double.MIN_VALUE+"-"+Double.MAX_VALUE);
		System.out.println("字符型数据的取值范围是"+(int)Character.MIN_VALUE+"-"+(int)Character.MAX_VALUE);
		System.out.println("布尔型数据的取值范围是"+Boolean.FALSE+"-"+Boolean.TRUE);
	}
}
