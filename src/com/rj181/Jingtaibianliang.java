package com.rj181;

class Student{
	static String schoolName;
	//静态代码块
	static{
		 int a;
	}
	
	{
		//broken:违例 不能用static修饰局部变量
	//	static int a;
	}
}
public class Jingtaibianliang {

	public static void main(String[] args) {
		Student s1=new Student();
		Student s2=new Student();
		//静态变量可以用类名直接引用
		//如果没有static关键字，只能用该类的实例也就是对象来引用
		Student.schoolName="江汉艺术职业学院";
		
		System.out.println("我是"+s1.schoolName+"的学生");
		System.out.println("我是"+s2.schoolName+"的学生");

	}

}
