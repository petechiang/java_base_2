package com.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Zfhc {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("d:/java电子教案 - 副本.doc");
		FileWriter fw=new FileWriter("d:/java电子教案.doc");
		char[]buff=new char[1024];
		long kssj=System.currentTimeMillis();
		int len=fr.read(buff);
		while (len!=-1) {
			fw.write(buff,0,len);
			len=fr.read(buff);
		}
		long jssj=System.currentTimeMillis();
		System.out.println("拷贝这个文件花费"+(jssj-kssj)+"毫秒");
		fr.close();
		fw.close();
	}

}
