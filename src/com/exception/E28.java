package com.exception;

public class E28 {

	public static void main(String[] args) {
		int result=divide(4,2);
		if (result==-1) {
			System.out.println("程序发生异常");
		}
		else
		System.out.println(result);
	}

	private static int divide(int x, int y) {
		// divide方法有两条return语句
		//执行了第一条就不执行第二条
		try {
			int result=x/y;
			return result;
		} catch (Exception e) {
			System.out.println("捕获的异常信息为:"+e.getMessage());
		}finally {
			System.out.println("不论是否被零除，上面都做了一个除法");
		}
		return -1;
	}

}
