package com.thread;
class DaemonThread implements Runnable{

	@Override
	public void run() {
		int i=0;
		while (i++<5) {
			System.out.println(Thread.currentThread().getName()+"的run()方法在运行");
		}
		
	}
	
}
public class Thread_test7 {

	public static void main(String[] args) {
		if (!Thread.currentThread().isDaemon()) {
			System.out.println("main线程是前台线程");
		}
		
		DaemonThread dt=new DaemonThread();
		Thread t=new Thread(dt, "后台线程");
		//将新线程设置为后台线程
		t.setDaemon(true);
		t.start();
		if (t.isDaemon()) {
			System.out.println("thread线程是后台线程");
		}
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
	}

}
