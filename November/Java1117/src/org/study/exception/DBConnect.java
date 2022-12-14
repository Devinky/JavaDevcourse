package org.study.exception;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
	
	public static Connection getConnection() {
		Connection conn = null;
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "system";
		String password = "1234";
		String driver = "oracle.jdbc.driver.OracleDriver";
		
		try {
			Class.forName(driver);
			System.out.println("Driver OK");
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("Connection Success");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("Driver NULL");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Connection Fail");
		}

		return conn;
	}

}
