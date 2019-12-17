package com.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

class Qiuhe_thread implements Callable<Object>{

	@Override
	public Object call() throws Exception {
		int sum=0;
		for (int i =1; i < 11; i++) {
			sum+=i;
		}
		switch (Thread.currentThread().getName()) {
		case "线程1":
			break;
		case "线程2":
			sum+=10*10;
			break;
		case "线程3":
			sum+=20*10;
			break;
		default:
			break;
		}
		return sum;
	}
	
}

public class Thread_test6 {

	public static void main(String[] args) throws Exception, ExecutionException {
		Qiuhe_thread qh1=new Qiuhe_thread();
		FutureTask<Object> ft1=new FutureTask<Object>(qh1);
		new Thread(ft1, "线程1").start();
		//System.out.println("线程1运行的结果是"+ft1.get());
		Qiuhe_thread qh2=new Qiuhe_thread();
		FutureTask<Object> ft2=new FutureTask<Object>(qh2);
		new Thread(ft2, "线程2").start();
		//System.out.println("线程2运行的结果是"+ft2.get());
		Qiuhe_thread qh3=new Qiuhe_thread();
		FutureTask<Object> ft3=new FutureTask<Object>(qh3);
		new Thread(ft3, "线程3").start();
		//System.out.println("线程3运行的结果是"+ft3.get());
		int total=(int)ft1.get()+(int)ft2.get()+(int)ft3.get();
		System.out.println("前三个线程的和是"+total);
	}

}
