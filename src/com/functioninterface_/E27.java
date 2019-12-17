package com.functioninterface_;
@FunctionalInterface
interface _Printable {
	void print(_StringUtils su,String str);
}

class _StringUtils {
	public void printUpperCase(String str) {
		System.out.println(str.toUpperCase());
	}
}

public class E27 {

	public static void main(String[] args) {
		//new _StringUtils()对应lambda表达式中的object参数
		//"Hello"对应lambda表达式中的t参数
		printUpper(new _StringUtils(),"Hello",(object,t)->object.printUpperCase(t));
		printUpper(new _StringUtils(), "World", _StringUtils::printUpperCase);
	 }

	private static void printUpper(_StringUtils stringUtils, String string, _Printable pt) {
		pt.print(stringUtils,string);
		
	}

}
