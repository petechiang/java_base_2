package com.thread;
class TicketWindow extends Thread{
	private int tickets=100;
	public void run() {
		while (true) {
			if (tickets>0) {
				System.out.println(Thread.currentThread().getName()+"正在卖第"+tickets+"张票");
			    tickets--;
			}
		}
	}
}
public class Thread_test4 {

	public static void main(String[] args) {
		new TicketWindow().start();
		TicketWindow tw2=new TicketWindow();
		tw2.start();
		TicketWindow tw3=new TicketWindow();
		tw3.start();
		TicketWindow tw4=new TicketWindow();
		tw4.start();
	}

}
