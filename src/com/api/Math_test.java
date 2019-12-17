package com.api;

public class Math_test {

	public static void main(String[] args) {
		System.out.println("计算绝对值的结果"+Math.abs(-5));
		System.out.println("计算正弦的结果"+Math.sin(-5));
		System.out.println("计算平方根的结果"+Math.sqrt(4));
		System.out.println("计算立方根的结果"+Math.cbrt(27));
		System.out.println("计算乘方的结果"+Math.pow(3,4));
		//ceil：天花板      floor：地板
		System.out.println("计算大于参数的最小整数"+Math.ceil(3.4));
		System.out.println("计算小于参数的最大整数"+Math.floor(3.4));
		System.out.println("计算四舍五入"+Math.round(-3.51));
		System.out.println("强制取整"+(int)(-3.8));
		
		
		

	}

}
