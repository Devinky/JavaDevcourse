package org.study.dbconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
	
	public static Connection getConnection() {
		Connection conn = null;
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "system";
		String password = "1234";
		
		try {
			//1.driver찾기
			Class.forName(driver);
			System.out.println("Oracle Driver Connect Complete");
			//2.DB연동
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("DB Connect Complete");
		} catch (ClassNotFoundException e) {
			System.out.println("Oracle Drive Connect Fail");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("DB Connect Fail");
			e.printStackTrace();
		}
		return conn;
	}

}
