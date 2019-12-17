package com.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class FileInputStream_test {

	public static void main(String[] args) throws IOException {
		FileInputStream fin=new FileInputStream("d:\\2018-2019成绩册.zip");
		FileOutputStream fout=new FileOutputStream("d:\\2018-2019成绩册1.rar");
		
		long kssj=System.currentTimeMillis();
		byte[] zjhc=new byte[1024];
		int b=fin.read(zjhc);
		while(b!=-1) {
			//System.out.println(b);
			fout.write(zjhc,0,b);
			b=fin.read(zjhc);
		}
		long jssj=System.currentTimeMillis();
		
		System.out.println("拷贝这张图片花费"+(jssj-kssj)+"毫秒");
		String string=new String(",加油！");
		fout.write(string.getBytes());
		PrintWriter pw = new PrintWriter(fout);
		pw.write(new String(string.getBytes(),"UTF-8"));
		fin.close();
		fout.close();
	}

}
