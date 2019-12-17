package com.io;

import java.io.File;
import java.io.FileDescriptor;
import java.util.Arrays;

public class Traverse_directory_test {

	public static void main(String[] args) {
		File file=new File("E:\\18软件1班作业\\1104\\Z309008\\高静 project_1");
		fileDir(file);
		/*if(file.isDirectory()) {
			String[] fileNames=file.list((dir,name)->name.endsWith(".java"));
			Arrays.stream(fileNames).forEach(f->System.out.println(f));
		}*/

	}

	private static void fileDir(File file) {
		File[] files=file.listFiles();
		//当前文件夹下面的每一个文件f
		for (File f : files) {
			//如果是目录
			if(f.isDirectory()) {
				//输出目录名
				System.out.println(f);
				//递归调用
				fileDir(f);
			}
			else
				//输出文件名
				System.out.println(f);
			
		}
		
	}

}
