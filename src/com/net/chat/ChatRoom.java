package com.net.chat;

import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.Scanner;

//聊天程序入口
public class ChatRoom {

	public static void main(String[] args) throws Exception {
		//int port =3000;
		//创建UDP发送套接字
		DatagramSocket sender_socket=new DatagramSocket(5000);
		//创建UDP接收套接字
		DatagramSocket receiver_socket=new DatagramSocket(3000);
		//分别启动接收端和发送端程序
		new Thread(new ChatReceiver(receiver_socket),"接收程序").start();
		new Thread(new ChatSender(sender_socket,3000),"发送程序").start();
		
	}

}
