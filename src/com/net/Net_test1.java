package com.net;

import java.net.InetAddress;

public class Net_test1 {

	public static void main(String[] args) throws Exception {
		InetAddress localAddress=InetAddress.getLocalHost();
		InetAddress  jhfuwuqi_address=InetAddress.getByName("www.hbjhart.com");
		System.out.println("本机的Ip地址是:"+localAddress.getHostAddress());
		System.out.println("江职服务器的Ip地址是:"+jhfuwuqi_address.getHostAddress());
	    if (jhfuwuqi_address.isReachable(3000)) {
		   System.out.println("江职服务器3秒内可达");	
		}
	    System.out.println("江职服务器的域名是:"+jhfuwuqi_address.getHostName());
	}

}
