package com.thread;

import java.util.ArrayList;
import java.util.List;

public class Thread_test14 {

	public static void main(String[] args) {
		// 定义集合类，存储产品
		List<Object> goods = new ArrayList<>();
		// 定义线程开始时间
		long start = System.currentTimeMillis();
		// 用lambda表达式创建一个生产者线程，并加入到集合中
		Thread t1 = new Thread(() -> {
			int i = 0;
			while (System.currentTimeMillis() - start < 30) {
				synchronized (goods) {
					if (goods.size() > 2) {
						try {
							//如果生产的商品大于0个，停止生产
							goods.wait();
						} catch (InterruptedException e) {
							// TODO 自动生成的 catch 块
							e.printStackTrace();
						}
					} else {
						goods.add("商品" + (++i));
						System.out.println("生产商品" + i);
					}

				}

			}
		}, "生产者线程");
		Thread t2 = new Thread(() -> {
			int i = 0;
			while (System.currentTimeMillis() - start < 30) {
				synchronized (goods) {
					if (goods.size()<=0) {
						//如果商品已经卖完了，唤醒生产者线程
						goods.notify();
					} else {
						goods.remove("商品" + (++i));
						System.out.println("消费商品" + i);
					}
				}
				
			}
		}, "消费者线程");
		t1.start();
		t2.start();
	}

}
