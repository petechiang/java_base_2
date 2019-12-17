package com.api;
//util:工具
import java.util.*;


public class System_property {

	public static void main(String[] args) {
		Properties xtsx=System.getProperties();
		//System.out.println(xtsx);
		Set<String> sxm=xtsx.stringPropertyNames();
		//foreach循环读出属性集里的内容
		for (String key : sxm) {
			String value=System.getProperty(key);
			System.out.println(key+"-->"+value);
		}
		
	}

}
