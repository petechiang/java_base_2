package com.jdbc;

import java.sql.*;


public class Test_conn {

	public static void main(String[] args) throws Exception {
		//驱动
		Class.forName("com.mysql.jdbc.Driver");
		//连接 
		Connection  lianjie=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jdbc","root","123456");
	    //语句
		Statement yuju=lianjie.createStatement();
		//sql
		String sql="update tb_user set email='jack@qq.com' where id=1";
		//执行操作查询
		yuju.execute(sql);
	}

}
