package com.school;
//POJO
public class Student {
	//定义两个成员变量
	//private：类可见性  当前属性只能在本类中被访问
	//将成员变量定义为私有的，就是类的封装
	//外部方法要访问这个成员变量，必须通过公有的getter setter方法
	private String name;
	//没有修饰符：包可见性  当前属性只能在本包中被访问
	private int score;
	
	//如果没有定义任何构造方法，java虚拟机会自动创建一个无参的构造方法
	//如果有了带参数的构造方法，java虚拟机将不会自动创建一个无参的构造方法
	//不管什么情况，都给类添加一个无参数的构造方法
	//定义无参的构造方法：
	//构造方法是一种特殊的方法：修饰符+类名([参数类型 参数名]){}
	private Student() {}
	//定义有参的构造方法
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public static void main(String[] args) {
		//创建对象:类名  对象名  = new 构造方法;
		         Student s1  =  new Student();
		         s1.setName("Pete");
		         s1.setScore(600);
		        
		         System.out.println(s1.getName()+"考了"+s1.getScore());
		         Student  s2 = new Student("Alice",590);
		         System.out.println(s2.getName()+"考了"+s2.getScore());
		         
		         System.out.println("score="+s1.getScore());
		         
		         
		         Course c1=new Course();
		         c1.setCourse_name("Java程序设计");
		         c1.setCourse_book("Java基础入门");
		         System.out.println(c1.getCourse_name()+"这门课使用的教材是《"+c1.getCourse_book()+"》");
		         
		         
		         

	}

}
