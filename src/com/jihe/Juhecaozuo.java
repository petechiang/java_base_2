package com.jihe;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Juhecaozuo {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("张三");
		list.add("李四");
		list.add("张小明");
		list.add("张阳");
		list.add("张小琴");
		list.add("张大琴");
		list.add("张晓琴");
		Stream<String> liu1=list.stream();
		Stream<String> liu2=liu1.filter(z->z.startsWith("张"));
		Stream<String> liu3=liu2.limit(2);
		liu3.forEach(k->System.out.println(k));
		
		System.out.println("==============================");
		//filter:里面元素的类型是字符串类的子类
		//skip:省略掉前面几个  limit:一共取几个
		//forEach: 遍历
		list.stream().filter(y->y.startsWith("张")&&y.length()>2).limit(4).skip(2).forEach(x->System.out.println(x));
		//collect:收集方法
		List<String> xlb=list.stream().filter(y->y.startsWith("张")).collect(Collectors.toList());
		System.out.println(xlb);
		String string=list.stream().filter(y->y.startsWith("张")).collect(Collectors.joining(" "));
	    System.out.println(string);
	}

}
