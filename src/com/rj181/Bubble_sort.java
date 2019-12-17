package com.rj181;

public class Bubble_sort {

	public static void main(String[] args) {
		// 数组的特征是中括号，这个中括号可以再数组名的前面或者后面
		// 可以有空格，也可以没有空格，但是一定要在数据类型后面
		int a[] = { 9, 8,15, 3, 5, 2 };
		System.out.println("数组a的长度是" + a.length);
		// 数组下标的最大值是数组长度减1
		System.out.print("初始数组各个元素是:");
		for(int xiaoa:a)
			System.out.print(xiaoa+"  ");
		/*
		 * 原始数据:9 8 3 5 2 第一趟： 8 9 3 5 2 3 9 8 5 2 39852 2 3985 第二趟： 23 985 第三趟： 235 98
		 * 第四趟： 23589
		 */
		// 外循环定义趟数
		for (int i = 1; i < a.length; i++) {
			// 内循环模拟每一趟的比较
			for (int j = 0; j < a.length - i; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}

			}

		}
		
		// 数组下标的最大值是数组长度减1
		System.out.print("\n冒泡排序结束后数组各个元素是:");
		//foreach循环  :读作 each in
		for (int xiaoa:a)
			System.out.print(xiaoa + "  ");
		
	}

}
