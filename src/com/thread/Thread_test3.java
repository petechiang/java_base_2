package com.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

class MyThread__ extends Thread implements Callable<Object>{

	public MyThread__() {
	
	}

	public MyThread__(String name) {
		super(name);
		// TODO 自动生成的构造函数存根
	}
	@Override
	public Integer call() throws Exception {
		int i=0;
		while (i++<15) {
			System.out.println(Thread.currentThread().getName()+"的run()方法在运行");
		}
		return i;
	}
	
}
public class Thread_test3 {

	public static void main(String[] args) throws Exception, ExecutionException {
		MyThread__ mt1=new MyThread__();
		FutureTask<Object> ft1=new FutureTask<Object>(mt1,"线程1");
		Thread t1=new Thread(ft1);
		t1.start();
		MyThread__ mt2=new MyThread__("线程2");
		FutureTask<Object> ft2=new FutureTask<Object>(mt2);
		Thread t2=new Thread(ft2);
		t2.start();
		new Thread(new FutureTask<Object>(new MyThread__("线程3"))).start();
		System.out.println("线程1返回结果:"+ft1.get());
		System.out.println("线程2返回结果:"+ft2.get());
	}

}