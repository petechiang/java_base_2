package com.abstract_;
abstract class Animal{
	//abstract 抽象
	public abstract void shout() ;
	void a() {}
}

class Dog extends Animal{
	//必须重写父类中的抽象方法
	@Override
	public void shout() {
		System.out.println("汪汪......");
	}

	
}
public class E12 {
	public static void main(String[] args) {
		//Animal dw=new Animal(); 
		Dog dog=new Dog();
		dog.shout();
	}

}
