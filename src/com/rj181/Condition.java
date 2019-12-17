package com.rj181;

import java.io.IOException;
import java.io.InputStream;

public class Condition {

	public static void main(String[] args) throws IOException {
		int age=11;
		//只输出第一个满足条件的结果
		/*if(age<18)
			System.out.println("此人未成年");
		else if(age<12)
			System.out.println("此人是儿童!");*/
		/*switch (age) {
		case 17:
		case 16:
		case 15:
		case 14:
		case 13:
		case 12:
			System.out.println("此人未成年");
			
		case 11:
		case 10:
		case 9:
		case 8:
		case 7:
			System.out.println("此人是儿童");
			break;
		case 6:
		case 5:
		case 4:
		case 3:
		case 2:
		case 1:
			System.out.println("此人是幼儿");
			break;
		default:
			break;*/
		System.out.println("请输入月份:");
		int t;
		
		int month=System.in.read()-'0';
		System.out.println(month);
		//ascii是unicode编码的子集 ,unicode编码是java字符的编码
		t=System.in.read();
		if (t!=0&&t!=13) {
			month=month*10+t-48;
		}
		System.out.println(month);
		//int month=5;
		switch (month) {
		case 12:
		case 1:
		case 2:
			System.out.println("当前为冬季");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("当前为春季");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("当前为夏季");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("当前为秋季");
			break;

		default:
			System.out.println("输入的月份不正确");
			break;
		}
		}
}	
		
		



