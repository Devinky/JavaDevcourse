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
		int result = 0;
		
		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";
		
		try {
			conn = DBConnect.getConnection();
			query = "insert into member1206 (userId,userPw,age,email) values(?,?,?,?)";
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
			}
		}
		return result;
	}

	public int updateDo(String userId, String userPw, int age, String email) {
		int result = 0;
		
		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";
		
		try {
			conn = DBConnect.getConnection();
			query = "update member1206 ";
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

	public List<Member1206> SelectDo(){
		
		List<Member1206> userlist = new ArrayList<Member1206>();
		
		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";
		ResultSet rs = null;
		
		try {
			conn = DBConnect.getConnection();
			query = "";
			pstm = conn.prepareStatement(query);
			
			rs = pstm.executeQuery();
			
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
		}
		
		return userlist;
	}
	
	public List<Member1206> SerchIdDo(String userId){
		
		List<Member1206> idlist = new ArrayList<Member1206>();
		
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		String query = "";
		
		try {
			conn = DBConnect.getConnection();
			query = "";
			pstm = conn.prepareStatement(query);
			
			
			rs = pstm.executeQuery(); //실행
			
			if(rs!=null) {
				while(rs.next()) {
					
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(conn!=null) conn.close();
				if(pstm!=null) pstm.close();
				if(rs!=null) rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {}
		}
		
		
		return idlist;
	}
}
