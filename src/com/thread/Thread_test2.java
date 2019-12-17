package com.thread;
class MyThread_ implements Runnable{

	public void run() {
		int i=0;
		while (i++<15) {
			System.out.println(Thread.currentThread().getName()+"的run()方法在运行");
		}
	}
	
}
public class Thread_test2 {

	public static void main(String[] args) {
		MyThread_ mt1=new MyThread_();
		Thread t1=new Thread(mt1,"线程1");
		t1.start();
		Thread t2=new Thread(new MyThread_(),"线程2");
		t2.start();
		new Thread(new MyThread_(),"线程3").start();
	}

}