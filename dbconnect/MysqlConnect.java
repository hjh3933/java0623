package org.project.dbconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MysqlConnect {
	public static void main(String[] args) {
		System.out.println("Exception");

		Connection conn = null; // 커넥션 객체 DB연결
		String driver = "com.mysql.cj.jdbc.Driver";	//My sql 5.7 이상
		// String url = "jdbc:mysql://localhost:3306/DB명";
		// String url = "jdbc:mysql://외부아이피:3306/DB명";
		String url = "jdbc:mysql://localhost:3306/world";
		String user = "root";
		String password = "1234";

		try {
			Class.forName(driver);
			System.out.println("OK");
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("Mysql DB Connect Ok");
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("No");
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
