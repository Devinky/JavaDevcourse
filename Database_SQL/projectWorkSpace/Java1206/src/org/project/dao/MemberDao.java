package org.project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.project.dbconnect.DBConnect;
import org.project.dto.Member1206;

public class MemberDao {
	
	public int InsertDo(String userId, String userPw, int age, String email) {
		System.out.println("아이디 : " + userId + " | 비밀번호 : " + userPw + " | 나이 : " + age + " | 이메일 : " + email);
		int result = 0;
		
		Connection conn = null; //DB연동 객체
		PreparedStatement pstm = null; //SQL문 처리 객체
		String query = "";
		
		try {
			conn = DBConnect.getConnection();
			query = "insert into member1206(userId, userPw, age, email) values(?,?,?,?)";
			pstm = conn.prepareStatement(query);
			//DB에 연결(conn), 커넥션 객체의 메서드에 쿼리문을 적용
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
			}
		}
		return result;
	}
	
	public List<Member1206> SelectDo() {
		List<Member1206> userlist = new ArrayList<>();
		
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		String query = "";
		
		try {
			conn = DBConnect.getConnection();
			query = "select * from member1206";
			pstm = conn.prepareStatement(query);
			rs = pstm.executeQuery();
			
			if(rs!=null) {
				while(rs.next()) { //테이블의 레코드를 한 줄씩 가져온다
					String userId = rs.getString(1);
					String userPw = rs.getString(2);
					int age = rs.getInt(3);
					String email = rs.getString(4);
					
					userlist.add(new Member1206(userId, userPw, age, email));
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
	
	public int UpdateDo(String userId, String userPw, int age, String email) {
		int result = 0;
		
		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";
		
		try {
			conn = DBConnect.getConnection();
			query = "update member1206 set userPw=?, age=?, email=? where userId=?";
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
			}
		}
		return result;
	}
	
	public int DeleteDo(String userId) {
		int result = 0;
		
		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";
		
		try {
			conn = DBConnect.getConnection();
			query = "delete from member1206 where userId=?";
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

	public List<Member1206> selectAge(int ageStart, int ageEnd) {
		List<Member1206> userlist = new ArrayList<>();
		
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		String query = "";
		
		try {
			conn = DBConnect.getConnection();
			query = "select * from member1206 where age>=? and age<=?";
			pstm = conn.prepareStatement(query);
			rs = pstm.executeQuery();
			
			pstm.setInt(1, ageStart);
			pstm.setInt(2, ageEnd);
			
			if(rs!=null) {
				while(rs.next()) {
					String userId = rs.getString(1);
					String userPw = rs.getString(2);
					int age = rs.getInt(3);
					String email = rs.getString(4);
					
					userlist.add(new Member1206(userId, userPw, age, email));
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

}
