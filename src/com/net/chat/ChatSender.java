package com.net.chat;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class ChatSender implements Runnable {

	private DatagramSocket client;
	private int port;

	public ChatSender(DatagramSocket client, int port) {
		this.client = client;
		this.port = port;//主动发送到对端的端口号是3000，自己的端口号是5000
	}

	@Override
	public void run() {
		// 创建Scanner对象，包装控制台输入
		Scanner sc = new Scanner(System.in);
		// 不停发送信息
		while (true) {
			try {
				System.out.println("请输入要发送的信息:");
				// 输入要发送的数据
				String str = sc.nextLine();
				// 将字符串数据转换为二进制数据
				byte[] hcqsz = str.getBytes("UTF-8");
				System.out.println("请输入要发送的IP地址:");
				String ip = sc.nextLine();
				// 将转换后的数据放到数据报里
				DatagramPacket packet = new DatagramPacket(hcqsz, hcqsz.length, InetAddress.getByName("10.2.103."+ip),port);
				client.send(packet);
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}

		}
	}
}
