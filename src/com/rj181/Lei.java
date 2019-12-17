package com.rj181;

import java.io.Serializable;
//定义类:
//[修饰符]+class+类名标识符+extends(继承关键字) 父类标识符+implements(实现关键字) 父接口标识符{}
//第一类修饰符表示作用范围：public公有的   proteted受保护的           private私有的
//第二类修饰符表示特定功能：static静态的   final最终的(该类没有子类)synchronized同步的
public  class Lei {
	//定义4个内部类
	public    static final class A extends Object implements Serializable{}
	protected static final class B extends Object implements Serializable{}
	          static final class C extends Object implements Serializable{}
	private   static final class D extends Object implements Serializable{}
	//定义2个成员变量:[修饰符]+变量所属的数据类型+变量标识符
	protected static int age=0;
	private static final String name="";
	//定义两个成员方法：[修饰符]+方法返回的值的数据类型+方法名(参数值的类型  参数名){}
	//方法名前面先有修饰符(可省略),方法名前面后有返回值类型(不可省略)
	//返回值类型为void表示空，方法体内不需要return语句
	//其他类型的返回值,方法体内都需要return语句
	//方法名后面先跟一对小括号，再跟一对大括号
	//方法名后面的一对小括号里可以包含参数，格式是：参数类型  参数名
	protected void setAge(int nianling) {
		age=nianling;
	}
	public double getAge() {
		return 0.0;
	}

}
//private default protected public:可访问性由小到大，不仅可以修饰类class
//还可以修饰类的成员变量Field、类的成员方法Method
//private:类可见性 default：包可见性  protected：子类可见性  public：无限制