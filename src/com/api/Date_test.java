package com.api;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

public class Date_test {

	public static void main(String[] args) throws ParseException {
	//System.currentTimeMillis():得到当前系统离开1970年1月1日午夜零点的毫秒数
		Date date1=new Date(System.currentTimeMillis());
		long d2=System.currentTimeMillis()+1000;
		Date date2=new Date(d2);
		System.out.println(date1);
		System.out.println(date2);
		
		SimpleDateFormat sdf=new SimpleDateFormat("Gyyyy年MM月dd日 HH时mm分ss秒 E");
		System.out.println(sdf.format(date1));
		
		Calendar rili=Calendar.getInstance();
		int nian=rili.get(Calendar.YEAR);
		int yue=rili.get(Calendar.MONTH)+1;
		int ri=rili.get(Calendar.DATE);
		System.out.println("今天是"+nian+"年"+yue+"月"+ri+"日");
		
		rili.set(nian, yue, ri);
		rili.add(Calendar.DATE, 100);
		nian=rili.get(Calendar.YEAR);
		yue=rili.get(Calendar.MONTH);
		ri=rili.get(Calendar.DATE);
		System.out.println("100天以后是"+nian+"年"+yue+"月"+ri+"日");
		
		LocalDate dqrq=LocalDate.now();
		LocalDate J_100 = dqrq.plusDays(100);
		//System.out.println(J_100);
		
		SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-MM-dd");
		//将LocalDate对象的值改成String类的对象用toString方法
		String ybtyh_zfc=J_100.toString();
		//先通过SimpleDateFormat对一百天以后的字符串进行解析，用parse方法
		Date date_100=sdf1.parse(ybtyh_zfc);
		//再通过SimpleDateFormat对一百天以后的Date对象进行格式化，用format方法
		SimpleDateFormat sdf2=new SimpleDateFormat("yyyy年M月dd日");
		System.out.println("100天以后是"+sdf2.format(date_100));
		
		SimpleDateFormat sdf3=new SimpleDateFormat("yyyy/MM/dd");
		String rqzfc="2018/01/27";
		Date date3=sdf3.parse(rqzfc);
		System.out.println(date3.toString());
		SimpleDateFormat sdf4=new SimpleDateFormat("yyyy年MM月dd日");
		System.out.println(sdf4.format(date3));
		
		String str1="abc";
		String str2="abc";
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		
		
		String str3=new String("java");
		String str4=new String("java");
		StringBuffer s5=new StringBuffer("java");
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str3==str4);
		System.out.println(str3.equals(str4));
		//System.out.println(str3==s5);
		
		
	}

}
