package com.io;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;


public class BufferedReader_test {

	public static void main(String[] args) throws Exception {
		FileReader fr=new FileReader("d:/reader.txt");
		//文件字符输入流包装成字符缓冲输入流
		BufferedReader br=new BufferedReader(fr);
		//上面两行可以合成一行
		BufferedWriter bw=new BufferedWriter(new FileWriter("d:/writer.txt",true));
		//BufferedReader的读方法结果是一个字符串
		String line=br.readLine();
		while (line!=null) {
			bw.write(line);
			line=br.readLine();
		}
        fr.close();
        br.close();
        bw.close();
	}

}
