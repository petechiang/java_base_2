package com.io;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Paths_test {

	public static void main(String[] args) {
		Path p=Paths.get("D:\\Java基础入门\\1 大纲\\Java基础入门—教学大纲.doc");
		System.out.println("这个文件所在的根目录是:"+p.getRoot());
		System.out.println("这个文件所在的父目录是:"+p.getParent());
		System.out.println("这个文件的路径名称数是:"+p.getNameCount());
		//循环输出路径名称
		for (int i = 0; i < p.getNameCount(); i++) {
			Path zlj=p.getName(i);
			System.out.println("索引为"+i+"的路径是:"+zlj);
		}
		System.out.println("这个文件的URI路径名称是:"+p.toUri());
		System.out.println("这个文件的绝对路径是:"+p.toAbsolutePath());
	}

}
