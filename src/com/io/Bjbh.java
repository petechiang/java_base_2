package com.io;


import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Bjbh {

	public static void main(String[] args) throws Exception {
		// 声明文件
		Path wj = Paths.get("D:\\tice\\班级信息.txt");
		Path wj2 = Paths.get("D:\\tice\\求班级编号.txt");
		Path wj3 = Paths.get("D:\\tice\\班级编号.txt");
		//创建文件
		Files.createFile(wj3);
		// 读取文件
		List<String> lines = Files.readAllLines(wj);
		// 读取文件
		List<String> lines2 = Files.readAllLines(wj2);
		//lines.forEach(x->System.out.println(x));
		Map<String,String> map=new HashMap<>();
		for (String line : lines) {
			String[]  zfcsz=line.split(" ");
			//System.out.println(zfcsz);
			    for (int i = 0; i < zfcsz.length; i++) {
					System.out.println(zfcsz[i]);
					
				}
				//map.put(zfcsz[1], zfcsz[0]);
		}
		List<String> list=new ArrayList<>();
		for (String line2 : lines2) {
			//list.add(line2+":"+map.get(line2));
		}
	//	System.out.println(list);
		Files.write(wj3, list, StandardOpenOption.APPEND);
	}

}
