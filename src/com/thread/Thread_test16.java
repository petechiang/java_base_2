package com.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Thread_test16 {

	public static void main(String[] args) throws Exception, ExecutionException {
		//1.创建第一个线程，执行1到10相加运算
CompletableFuture<Integer> cf1=CompletableFuture.supplyAsync(()->{

				int sum=0,i=0;
				while (i++<10) {
					sum+=i;
					System.out.println(Thread.currentThread().getName()+"线程任务正在执行:"+i);
				}
				return sum;
		});
//2.创建第一个线程，执行11到20相加运算
CompletableFuture<Integer> cf2=CompletableFuture.supplyAsync(()->{

		int sum=0,i=10;
		while (i++<20) {
			sum+=i;
			System.out.println(Thread.currentThread().getName()+"线程任务正在执行:"+i);
		}
		return sum;
});
//3.创建第一个线程，执行21到30相加运算
CompletableFuture<Integer> cf3=CompletableFuture.supplyAsync(()->{

		int sum=0,i=20;
		while (i++<30) {
			sum+=i;
			System.out.println(Thread.currentThread().getName()+"线程任务正在执行:"+i);
		}
		return sum;
});
   //将两个线程的结果进行求和
//CompletableFuture<Integer> cf4=cf1.thenCombine(cf2, (r1,r2)->r1+r2);
       int total=cf3.get()+cf2.get()+cf1.get();
System.out.println("1到30相加的结果是"+total);
	}

}
