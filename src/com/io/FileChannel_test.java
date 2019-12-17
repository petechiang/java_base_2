package com.io;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;

public class FileChannel_test {

	public static void main(String[] args) throws Exception {
		RandomAccessFile yswj=new RandomAccessFile("d:\\ewm.jpg","rw");
		RandomAccessFile mbwj=new RandomAccessFile("d:\\ewm1.jpg","rw");
		FileChannel finc=yswj.getChannel();
		FileChannel foutc=mbwj.getChannel();
		long wjdx=finc.transferTo(0, finc.size(), foutc);
		if (wjdx>0) {
			System.out.println("复制成功");
		}
		yswj.close();
		mbwj.close();
		finc.close();
		foutc.close();

	}

}
