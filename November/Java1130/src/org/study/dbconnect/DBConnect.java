package org.study.dbconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//DB연동
public class DBConnect {
	
	public static Connection getConnection() {
		//1.jdbc 드라이버 찾기
		//2.DB연동(oracle)
		Connection conn = null; //DB연결 객체, 데이터베이스와 연결하여 데이터를 주고받을 수 있게 해주는 인터페이스
		
		String driver = "oracle.jdbc.driver.OracleDriver"; //오라클 드라이버
		String url = "jdbc:oracle:thin:@localhost:1521:xe"; //오라클 기본 DB URL
		String user = "system"; //user ID
		String password = "1234"; //user PassWord
		
		//1.driver 찾기
		try {
			Class.forName(driver);
			System.out.println("Oracle Driver 연결 성공");
			//2.DB연결 -> xe
			conn = DriverManager.getConnection(url, user, password);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("Oracle Driver 연결 실패");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("DB연결 실패");
		} 
		System.out.println(conn);
		
		if(conn!=null) {
			System.out.println("Oracle 연동 성공");
		}else {
			System.out.println("Oracle 연동 실패");
		}
		
		return conn;
	}

}
