package com.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class TicketWindow4 implements Runnable {
	private int tickets = 10;
	private final Lock lock = new ReentrantLock();

	public void run() {
		while (true) {
			lock.lock();
			if (tickets > 0) {
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				} finally {
					lock.unlock();
				}
				System.out.println(Thread.currentThread().getName() + "正在卖第" + tickets-- + "张票");

			}
		}
	}
}

public class Thread_test12 {

	public static void main(String[] args) {

		TicketWindow4 tw = new TicketWindow4();
		new Thread(tw, "窗口1").start();
		new Thread(tw, "窗口2").start();
		new Thread(tw, "窗口3").start();
		new Thread(tw, "窗口4").start();
	}

}