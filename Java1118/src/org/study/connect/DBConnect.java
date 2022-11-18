package org.study.connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
	
	public static Connection getConnection() {
		
		Connection conn = null; //DB연결
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "system";
		String password = "1234";
		String driver = "oracle.jdbc.driver.OracleDriver";
		
		//1.driver load
		try {
			Class.forName(driver);
			System.out.println("Driver OK");
			//2.DB연동
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("Connect Success");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("Driver NULL");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Connect Fail");
		}
		
		return conn;
	}

}
