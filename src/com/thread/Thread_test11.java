package com.thread;
class TicketWindow3 implements Runnable {
	private int tickets = 10;
	

	public void run() {
		while (true) {
			
				maipiao();
			}
		}

     //同步方法
	private synchronized void maipiao() {
		if (tickets > 0) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			
				System.out.println(Thread.currentThread().getName() + "正在卖第" + tickets-- + "张票");
			
		}
		
	}
	
}

public class Thread_test11 {

	public static void main(String[] args) {
		TicketWindow3 tw = new TicketWindow3();
		new Thread(tw, "窗口1").start();
		new Thread(tw, "窗口2").start();
		new Thread(tw, "窗口3").start();
		new Thread(tw, "窗口4").start();

	}

}
