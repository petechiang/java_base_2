package com.rj181;

import java.io.Serializable;

public class Break extends Object implements Serializable{

	public static void main(String[] args) {
		int x = 1;
		while (x <= 5) {
			if (x == 3) {
				x++;
				continue;
			}
			System.out.println("x=" + x);
			x++;
			

		}

	}
	//内部类
	private final static class abc{}
	final static class def{}
	protected final static class bcd{}
	public final static class cde{}
	//修饰符关键字是class前面的关键字: final最终的表示此类不能被继承  static静态的
	//public公有的 protected受保护的 private私有的这3个关键字是作用范围，只能选一个
	//继承关键字extends是class后面的关键字，表示本类继承了哪个父类
	//实现接口关键字implements也class后面的关键字，表示本类实现了哪个父接口
	
}

