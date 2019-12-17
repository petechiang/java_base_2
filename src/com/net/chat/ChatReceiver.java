package com.net.chat;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ChatReceiver implements Runnable  {
    private DatagramSocket socket=null;
	public ChatReceiver(DatagramSocket soket) {
		this.socket=soket;//从主程序过来，端口是5000
	}
	@Override
	public void run() {
				try {//准备字节数组，1024个字节大小
				byte[] zjsz=new byte[1024];
				//创建数据报，用于接收数据
				DatagramPacket dp=new DatagramPacket(zjsz, zjsz.length);
				//创建死循环，不停接收数据
				while (true) {
					//通过套接字接收数据报
					
						socket.receive(dp);
						//将数据报中的内容get出来,并使用指定编码转换为字符串
						String neirong=new String(dp.getData(),"UTF-8");
						System.out.println("来自"+dp.getAddress().getHostAddress()+"的信息:"+neirong);
				 }
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
		
	}

}
