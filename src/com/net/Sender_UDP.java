package com.net;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Sender_UDP {

	public static void main(String[] args) throws Exception {
		DatagramSocket client=new DatagramSocket(30000);
		//定义要发送的数据
		String str="来自张三的问候";
		//将字符串数据转换为二进制数据
		byte[] hcqsz=str.getBytes("UTF-8");
		//将转换后的数据放到数据报里
		DatagramPacket packet=new DatagramPacket(hcqsz, hcqsz.length, InetAddress.getByName("10.2.103.31"),8900);
		System.out.println("开始发送信息......");
		client.send(packet);
		client.close();
	}

}
