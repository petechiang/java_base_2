package com.io;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

public class RandomAccessFile_test {

	public static void main(String[] args) throws Exception {
		RandomAccessFile raf=new RandomAccessFile("t.txt","rw");
		
		int times=Integer.parseInt(raf.readLine())-1;
		
		if (times>0) {
			System.out.println("您可以试用"+times+"次");
			//将指针重新指向文件开头
			raf.seek(0);
			raf.write((times+"").getBytes());
		}else {
			System.out.println("试用次数已经用完");
		}
		raf.close();
	}

}
