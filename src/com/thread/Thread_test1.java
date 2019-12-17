package com.thread;
class MyThread extends Thread{

	public MyThread(String name) {
		super(name);
		// TODO 自动生成的构造函数存根
	}
	public void run() {
		int i=0;
		while (i++<15) {
			//Thead：线程  currentThread：当前线程
			System.out.println(Thread.currentThread().getName()+"的run()方法在运行");
		}
	}
	
}
public class Thread_test1 {

	public static void main(String[] args) {
		MyThread t1=new MyThread("线程1");
		t1.start();
		new MyThread("线程2").start();
	}

}
