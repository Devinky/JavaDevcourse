package org.study.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.study.dbconnect.DBConnect;

public class MemberDao {
	//반환타입이 반드시 int여야함(왜인지는 나중에 알려준다함)
	public int insert(String userId, String userPw, int age) {
		System.out.println("아이디 : " + userId + " , 비밀번호 : " + userPw + " , 나이 : " + age);
		int result = 0;

		Connection conn = null; //DB연동
		PreparedStatement pstm = null; //SQL처리
		String query = ""; //쿼리문
		
		
		try {
			//1.DB연동
			//1-1.드라이버 찾기
			//1-2.DB연결
			conn = DBConnect.getConnection();
			query = "insert into member(userId,userPw,age) values(?,?,?)";

			//2.SQL실행
			pstm = conn.prepareStatement(query); //DB연동해서 쿼리 실행
			//DB Table에 insert
			pstm.setString(1, userId);
			pstm.setString(2, userPw);
			pstm.setInt(3, age);
			
			//3.실행, 결과반환
			result = pstm.executeUpdate(); //성공하면 1, 실패하면 나머지
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
				try {
					if(conn!=null) conn.close();
					if(pstm!=null) pstm.close();
				} catch (Exception e) {
				} finally {
				}
		}
		
		return result;
	}
	
	

}
