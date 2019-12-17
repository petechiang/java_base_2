package com.functioninterface_;
//声明这是一个无参数和无返回值类型的函数式接口，有且仅有一个抽象方法
@FunctionalInterface
interface Animal{
	void shout();
}

//声明这是一个有参数和返回值类型的函数式接口，有且仅有一个抽象方法
@FunctionalInterface
interface Calculate{
	int sum(int x,int y);
}


public class E23 {

	public static void main(String[] args) {
		//通过lambda表达式调用方法
		animalShout(()->System.out.println("dddd"));
		showSum(10,20,(x,y)->x+y);

	}

	private static void showSum(int x, int y, Calculate c) {
		System.out.println(x+"+"+y+"的和是"+c.sum(x, y));
	}

	private static void animalShout(Animal an) {
		an.shout();
	}

}
