package org.study.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.study.dbconnect.DBConnect;
import org.study.dto.MemberDto;

public class MemberDao {
	
	//1. 회원가입 - 결과값이 1이면 성공
	public int insertDo(String userId, String userPw, int age, String email) {
		System.out.println(userId + " " + userPw + " " + age + " " + email);
		int result = 0;
		
		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";
		
		try {
			conn = DBConnect.getConnection();
			query = "insert into member2(userId,userPw,age,email) values(?,?,?,?)";
			pstm = conn.prepareStatement(query);
			
			pstm.setString(1, userId);
			pstm.setString(2, userPw);
			pstm.setInt(3, age);
			pstm.setString(4, email);
			
			result = pstm.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
				try {
					if(conn!=null) conn.close();
					if(pstm!=null) pstm.close();
				} catch (SQLException e) {
					e.printStackTrace();
				} finally {}
		}
		return result;
	}
	
	//2. 회원조회
	public ArrayList<MemberDto> selectDo(){
		ArrayList<MemberDto> userlist = new ArrayList<>();
		
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null; //DB에 있는 테이블데이터를 가져와서 담을 그릇
		String query = "";
		
		try {
			conn = DBConnect.getConnection();
			query = "select * from member2";
			pstm = conn.prepareStatement(query);
			rs = pstm.executeQuery();
			
			if(rs!=null) {
				while(rs.next()) {
					String userId = rs.getString(1);
					String userPw = rs.getString(2);
					int age = rs.getInt(3);
					String email = rs.getString(4);
					
					userlist.add(new MemberDto(userId, userPw, age, email));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
				try {
					if(conn!=null) conn.close();
					if(pstm!=null) pstm.close();
					if(rs!=null) rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				} finally {}
		}
		return userlist;
	}
	
	//3. 회원수정
	public int updateDo(String userId, String userPw, int age, String email) {
		int result = 0;
		
		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";
		
		try {
			conn = DBConnect.getConnection();
			query = "update member2 set userpw=?,age=?,email=? where userid=?";
			pstm = conn.prepareStatement(query);
			
			pstm.setString(1, userPw);
			pstm.setInt(2, age);
			pstm.setString(3, email);
			pstm.setString(4, userId);
			
			result = pstm.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(conn!=null) conn.close();
				if(pstm!=null) pstm.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {}
		}
		return result;
	}
	
	//4. 회원탈퇴
	public int deletoDo(String userId) {
		int result = 0;

		Connection conn = null;
		PreparedStatement pstm = null;
		
		String query = "";
		
		try {
			conn = DBConnect.getConnection();
			query = "delete from member2 where userid=?";
			pstm = conn.prepareStatement(query);
			
			pstm.setString(1, userId);
			
			result = pstm.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(conn!=null) conn.close();
				if(pstm!=null) pstm.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {}
		}
		return result;
	}

}
