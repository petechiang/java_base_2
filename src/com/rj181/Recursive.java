package com.rj181;

public class Recursive {
	//递归求和
	//在方法的内部自己调用自己，就叫方法的递归，一般来说参数值不一样
	public static int getSum(int n) {
		//最终参数值
		if(n==1)return 1;
		
		int temp=getSum(n-1);
		//除了1以外，都加上它前面元素的和以及元素本身
		return n+temp;
	}
	//getSum(4)=4+getSum(3)=4+6=10   
	//getSum(3)=getSum(2)+3=3+3=6
	//getSum(2)=getSum(1)+2=1+2=3
	//getSum(1)=1
	
	public static void main(String[] args) {
		System.out.println("1到4的和是"+getSum(4));

	}

}
