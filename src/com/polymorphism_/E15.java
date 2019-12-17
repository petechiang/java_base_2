package com.polymorphism_;
abstract class Animal{
	public abstract void shout();
}
class Cat extends Animal{

	@Override
	public void shout() {
		System.out.println("喵喵......");
	}
	public void catchMouse() {
		System.out.println("猫捉老鼠");
	}
	
}
class Dog extends Animal{

	@Override
	public void shout() {
		System.out.println("wangwang......");
	}
	
}
public class E15 {

	public static void main(String[] args) {
		Animal an1=new Cat();
		an1.shout();
		
		Employee e=new Manager();
		Manager m=new Manager();
		
	/*	Director e=new Manager();
		Director e=new Employee();
		Manager e=new Director();*/
		
		
		Animal an2=new Dog();
		an2.shout();
		//对象  instanceof 类  instanceof关键字表示左边对象是右边类的实例
		if (an1 instanceof Cat) {
			Cat mao=(Cat)an1;
			mao.catchMouse();
		}else {
			System.out.println("该类型的对象不是Cat类型");
		}
		
		if (an2 instanceof Cat) {
			Cat mao=(Cat)an1;
			mao.catchMouse();
		}else {
			System.out.println("该类型的对象不是Cat类型");
		}
		
	}

}
class Employee{}
class Director extends Employee{} 
class Manager extends Employee{} 