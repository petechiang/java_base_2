package com.io;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReader_test {

	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("d:/reader.txt");
		
		int len=fr.read();
		while (len!=-1) {
			System.out.print((char)len);
			len=fr.read();
		}
		fr.close();
		
		FileWriter fw=new FileWriter("d:/writer.txt");
		fw.write("再别康桥  \r\n");
		fw.write("---徐志摩  \r\n");
		
		fw.close();
	}

}
