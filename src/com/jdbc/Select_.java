package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Select_ {

	public static void main(String[] args) throws Exception {
		// 驱动
		Class.forName("com.mysql.jdbc.Driver");
		// 连接
		Connection lianjie = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jdbc", "root", "123456");
		// 语句
		Statement yuju = lianjie.createStatement();
		// sql
		String sql = "select * from tb_user";
		//执行普通查询
		ResultSet rs=yuju.executeQuery(sql);
		while (rs.next()) {
			int id=rs.getInt(1);
			String xingming=rs.getString(3);
			System.out.println(id+":"+xingming);
		}
	}

}
