package com.rj181;

public class Operator {

	public static void main(String[] args) {
		//算术运算符++
		int i=1;
		int j=1;
		System.out.println("先加表达式的值等于变量的值加1,也就是"+(++j));
		System.out.println("后加表达式的值等于变量的值,也就是"+(i++));
		System.out.println("不管先加还是后加,变量的值都加了1,也就是"+j);
		System.out.println("不管先加还是后加,变量的值都加了1,也就是"+i);
		
		//赋值运算符
		int c=2;
		c+=3;//等价于a=a+2;
		System.out.println("c="+c);
		
		//比较运算符  ==  返回一个布尔值
		String s1="hello";
		String s2="hello";
		System.out.println(s1==s2);
		Test1 t1=new Test1();
		Test1 t2=new Test1();
		System.out.println(t1==t2);
		
		//逻辑运算符
		int x=0;
		int y=0;
		int z=0;
		boolean a,b;
		//&是逻辑与,它的左边x>0 => false,任然要判断右边是真还是假
		a=x>0&y++>1;
		System.out.println("a="+a);
		System.out.println("y="+y);
		//&&是短路与,它的左边x>0 => false,不需要要判断右边是真还是假
		b=x>0&&z++>1;
		System.out.println("b="+b);
		System.out.println("z="+z);
		
		//条件运算符
		int store=105;
		System.out.println(store<=0?"没有库存了":store>100?"库存太多了":"库存量是"+store);
		int q=2;
		System.out.println(q>0?q+1:5);
	}

}
