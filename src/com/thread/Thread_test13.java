package com.thread;
class DeadLockThread implements Runnable{
	static Object chopsticks=new Object();
	static Object knives=new Object();
	private boolean flag;
	DeadLockThread(boolean flag) {
		this.flag = flag;
	}
	@Override
	public void run() {
		if (flag) {
			synchronized (chopsticks) {
				System.out.println(Thread.currentThread().getName()+"---if---chopsticks");
			 
			synchronized (knives) {
			    	System.out.println(Thread.currentThread().getName()+"---if---knives");
			}
			}
		} else {
			synchronized (knives) {
				System.out.println(Thread.currentThread().getName()+"---else---knives");
			    synchronized (chopsticks) {
			    	System.out.println(Thread.currentThread().getName()+"---else---chopsticks");
				}
			}

		}
		
	}
	
}
public class Thread_test13 {

	public static void main(String[] args) {
		DeadLockThread	d1=new DeadLockThread(true);
		DeadLockThread	d2=new DeadLockThread(false);
		new Thread(d1,"Chinese").start();
		new Thread(d2,"American").start();

	}

}
