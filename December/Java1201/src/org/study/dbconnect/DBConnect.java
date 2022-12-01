package org.study.dbconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
	
	//반환값이 int면 return을 int로 받아야함
//	public int a() {
//		int b = 0;
//		return b;
//	}
	
	public static Connection getConnection() {
		Connection conn = null;
	String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "system";
		String password = "1234";
		
		try {
			Class.forName(driver);
			System.out.println("Oracle Driver 연결 성공");
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("DB 연결 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("Oracle Driver 연결 실패");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.	
		println("DB 연결 실패");
			e.printStackTrace();
		}
		
		return conn;
	}

}
