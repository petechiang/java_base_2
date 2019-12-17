package com.inner_class;
class Outer{
	static int m=0;
	void test1() {
		System.out.println("外部类的成员方法test1");
	}
	void test2() {
		//局部内部类:方法体内部写的类
		class Inner{
			int n=1;
			void show() {
				System.out.println("外部类的变量m="+m);
				//在局部内部类调用外部类的方法
				test1();
			}
		}
		
		Inner inner=new Inner();
		System.out.println("内部类的变量n="+inner.n);
		inner.show();
	}
	static class Inner{
		void show() {
			System.out.println("外部类的变量m="+m);
		}
	}
}
public class E19 {

	public static void main(String[] args) {
		Outer outer=new Outer();
		outer.test2();

		Outer.Inner inner=new Outer.Inner();
		inner.show();
	}

}
