package com.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
//1.定义一个实现Callable接口的实现类
class MyThread_6 implements Callable<Object>{
	@Override
	public Object call() throws Exception {
		int i=0;
		while (i++<5) {
			System.out.println(Thread.currentThread().getName() + "的call()方法正在运行");
		}
		return i;
	}
	
}
public class Thread_test15 {

	public static void main(String[] args) throws Exception, ExecutionException {
		//2.创建Callable接口的实现类
		MyThread_6 mt6=new MyThread_6();
		//3.使用Excutors线程执行器类创建可扩展的线程池
		ExecutorService  excutor=Executors.newCachedThreadPool();
		//4.将Callable接口实现类的对象提交到线程池进行管理
		Future<Object> rusult1=excutor.submit(mt6);
		Future<Object> rusult2=excutor.submit(mt6);
		//5.关闭线程池
		excutor.shutdown();
		System.out.println("thread-1返回结果"+rusult1.get());
		System.out.println("thread-2返回结果"+rusult2.get());

	}

}
