package org.project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.project.dbconnect.DBConnect;
import org.project.dto.Member1207;

public class MemberDao {
	
	public int InsertDo(String userId, String userPw, int age, String email) {
		int result = 0;
		
		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";
		
		try {
			conn = DBConnect.getConnection();
			query = "insert into member1207 (userId,userPw,age,email) values(?,?,?,?)";
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
			query = "delete from member1207 where userId=?";
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
			query = "update member1207 ";
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

	public List<Member1207> SelectDo(){
		
		List<Member1207> userlist = new ArrayList<Member1207>();
		
		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";
		ResultSet rs = null;
		
		try {
			conn = DBConnect.getConnection();
			query = "select * from member1207";
			pstm = conn.prepareStatement(query);
			
			rs = pstm.executeQuery();
			
			if(rs!=null) {
				while(rs.next()) {
					String userId = rs.getString(1);
					String userPw = rs.getString(2);
					int age = rs.getInt(3);
					String email = rs.getString(4);
					
					userlist.add(new Member1207(userId, userPw, age, email));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return userlist;
	}
	
	public List<Member1207> SerchIdDo(String userId){
		
		List<Member1207> idlist = new ArrayList<Member1207>();
		
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		String query = "";
		
		try {
			conn = DBConnect.getConnection();
			query = "select * from member1207 where userid like '%"+userId+"%'";
			pstm = conn.prepareStatement(query);
			
//			pstm.setString(1, userId);
			
			rs = pstm.executeQuery(); //실행
			if(rs!=null) {
				while(rs.next()) {
//					String userId = rs.getString(1);
//					String userPw = rs.getString(2);
//					int age = rs.getInt(3);
//					String email = rs.getString(4);
					
					idlist.add(new Member1207(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getString(4)));
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
	
	public List<Member1207> SelectAge(int startAge, int endAge){
		
		List<Member1207> sellist = new ArrayList<Member1207>();
		
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		String query = "";
		
		try {
			conn = DBConnect.getConnection();
			query = "select * from member1207 where age>=? and age<?";
			pstm = conn.prepareStatement(query);
			
			pstm.setInt(1, startAge);
			pstm.setInt(2, endAge);

			rs = pstm.executeQuery(); //얘 setInt보다 아래에 써야함
			if(rs!=null) {
				while(rs.next()) {
					String userId = rs.getString(1);
					String userPw = rs.getString(2);
					int age = rs.getInt(3);
					String email = rs.getString(4);
					
					sellist.add(new Member1207(userId, userPw, age, email));
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
		return sellist;
		
	}

	public List<Member1207> sortDo(String sort) {
		
		List<Member1207> userlist = new ArrayList<Member1207>();
		//select * from member1207 order by userId desc;
		
		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";
		ResultSet rs = null;
		
		try {
			conn = DBConnect.getConnection(); //DB에 연결
			query = "select * from member1207 order by userId "+sort+"";
			pstm = conn.prepareStatement(query); //쿼리문을 DB에 담아 보냄
			
//			pstm.setString(1, sort); ->얘는 안쓰네...왜지?
			
			rs = pstm.executeQuery();
			
			if(rs!=null) {
				while(rs.next()) {
					String userId = rs.getString(1);
					String userPw = rs.getString(2);
					int age = rs.getInt(3);
					String email = rs.getString(4);
					
					userlist.add(new Member1207(userId, userPw, age, email));
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

	public List<Member1207> sort2Do(String userInfo, String sort){
		List<Member1207> userlist = new ArrayList<Member1207>();
		
		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";
		ResultSet rs = null;
		
		try {
			conn = DBConnect.getConnection();
			query = "select * from member1207 order by "+userInfo+" "+sort+"";
			pstm = conn.prepareStatement(query);
			rs = pstm.executeQuery();
			
			if(rs!=null) {
				while(rs.next()) {
					String userId = rs.getString(1);
					String userPw = rs.getString(2);
					int age = rs.getInt(3);
					String email = rs.getString(4);
					
					userlist.add(new Member1207(userId, userPw, age, email));
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
