package org.project.dbconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OracleConnect {
	public static void main(String[] args) {
		System.out.println("Exception");

		Connection conn = null; // Ŀ�ؼ� ��ü DB����
		String driver = "oracle.jdbc.driver.OracleDriver";
		// String url = "jdbc:oracle:thin:@�ܺξ�����:1521:xe";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "system";
		String password = "1234";

		try {
			Class.forName(driver);
			System.out.println("OK");

			conn = DriverManager.getConnection(url, user, password);
			System.out.println("DB Connect Ok");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("NO");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
