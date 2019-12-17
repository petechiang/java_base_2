package com.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class InputStreamReader_test {

	public static void main(String[] args) throws Exception{
		System.out.println("请输入您的年龄:");
		//定义标准字节输入流
		InputStream is=System.in;
		//将标准字节输入流转成字符流
		InputStreamReader ir=new InputStreamReader(is);
		//将字符流包装成缓冲流
		BufferedReader br=new BufferedReader(ir);
		//定义缓冲字符输出流
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(new FileOutputStream("d:\\age.txt")));
		String line=br.readLine();
		if (Integer.parseInt(line)>18) {
			bw.write(line);
			bw.write("您已经成年");
			System.out.println("您已经成年");
		}
		is.close();
		ir.close();
		br.close();
		bw.flush();
		bw.close();
	}

}
