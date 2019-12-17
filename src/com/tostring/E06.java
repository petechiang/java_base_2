package com.tostring;



//定义animal类
class Animal {
	String name;
	
	public Animal(String name) {
		this.name = name;
	}
	public Animal() {
		super();
		// TODO 自动生成的构造函数存根
	}
	void shout() {
		System.out.println("动物叫");
	}
	//重写父类Object中的toString方法
	@Override
	public String toString() {
		return "这是一只动物";
	} 
}
class Dog extends Animal{
    void shout() {
		System.out.println("动物叫");
	}
	@Override
	public String toString() {
		return "这是一只小狗";
	} 
}
//定义测试类
public class E06 {
    
	public static void main(String[] args) {
		Animal dw=new Animal();
		Dog xg=new Dog();
		System.out.println(dw);//输出对象==输出对象.toString()
		System.out.println(xg.toString());
		
	}

}
