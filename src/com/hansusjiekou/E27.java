package com.hansusjiekou;
@FunctionalInterface
interface Printable {
	void print(StringUtils su,String str);
}

class StringUtils {
	public void printUpperCase(String str) {
		System.out.println(str.toUpperCase());
	}
}




public class E27 {

	public static void main(String[] args) {
		

	}

}
