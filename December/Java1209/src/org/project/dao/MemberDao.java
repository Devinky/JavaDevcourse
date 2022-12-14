package org.project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.project.dbconnect.DBConnect;
import org.project.dto.Board01;
import org.project.dto.Member01;

public class MemberDao {
	
	public int InsertDo(String userId, String userPw, String email) {
		int result = 0;
		
		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";
		
		try {
			conn = DBConnect.getConnection();
			query = "insert into member01 (userId,userPw,email) values(?,?,?,)";
			pstm = conn.prepareStatement(query);
			
			pstm.setString(1, userId);
			pstm.setString(2, userPw);
			pstm.setString(3, email);
			
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
			query = "delete from member01 where userId=?";
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

	public int updateDo(String userId, String userPw, String email) {
		int result = 0;
		
		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";
		
		try {
			conn = DBConnect.getConnection();
			query = "update member01 set ";
			pstm = conn.prepareStatement(query);
			
			pstm.setString(1, userId);
			pstm.setString(2, userPw);
			pstm.setString(3, email);
			
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

	public List<Member01> SelectDo(){
		
		List<Member01> userlist = new ArrayList<Member01>();
		
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
					
					userlist.add(new Member01(userId, userPw, email));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return userlist;
	}
	
	public List<Member01> SerchIdDo(String userId){
		
		List<Member01> idlist = new ArrayList<Member01>();
		
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		String query = "";
		
		try {
			conn = DBConnect.getConnection();
			query = "select * from member1207 where userid like '%"+userId+"%'";
			pstm = conn.prepareStatement(query);
			
//			pstm.setString(1, userId);
			
			rs = pstm.executeQuery(); //??????
			if(rs!=null) {
				while(rs.next()) {
//					String userId = rs.getString(1);
//					String userPw = rs.getString(2);
//					int age = rs.getInt(3);
//					String email = rs.getString(4);
					
					idlist.add(new Member01(rs.getString(1), rs.getString(2), rs.getString(3)));
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
	
	public List<Member01> sortDo(String sort) {
		
		List<Member01> userlist = new ArrayList<Member01>();
		//select * from member1207 order by userId desc;
		
		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";
		ResultSet rs = null;
		
		try {
			conn = DBConnect.getConnection(); //DB??? ??????
			query = "select * from member1207 order by userId "+sort+"";
			pstm = conn.prepareStatement(query); //???????????? DB??? ?????? ??????
			
//			pstm.setString(1, sort); ->?????? ?????????...???????
			
			rs = pstm.executeQuery();
			
			if(rs!=null) {
				while(rs.next()) {
					String userId = rs.getString(1);
					String userPw = rs.getString(2);
					int age = rs.getInt(3);
					String email = rs.getString(4);
					
					userlist.add(new Member01(userId, userPw, email));
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

	public List<Member01> sort2Do(String userInfo, String sort){
		List<Member01> userlist = new ArrayList<Member01>();
		
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
					String email = rs.getString(3);
					
					userlist.add(new Member01(userId, userPw, email));
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

	public int BoardWriteDo(int bId, String writeId, String bContent) {
		int result = 0;
		
		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";
		
		try {
			conn = DBConnect.getConnection();
			query = "insert into Board1207(bId, writeId, bContent) values(?,?,?)";
			pstm = conn.prepareStatement(query);
			
			pstm.setInt(1, bId);
			pstm.setString(2, writeId);
			pstm.setString(3, bContent);
			
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

	public int BoardWriteFKDo(String bTitle, String bContent, String bWriteId) {
		int result = 0;
		
		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";
		
		try {
			conn = DBConnect.getConnection();
			query = "insert into board01(bid, btitle, bcontent, bwriteid) values(board01_sequence.nextval,?,?,?)";
			pstm = conn.prepareStatement(query);
			
			pstm.setString(1, bTitle);
			pstm.setString(2, bContent);
			pstm.setString(3, bWriteId);
			
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

	public List<Board01> BoardSelectDo(){
		List<Board01> bList = new ArrayList<Board01>();
		
		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";
		ResultSet rs = null;
		
		try {
			conn = DBConnect.getConnection();
			query = "select * from board01";
			pstm = conn.prepareStatement(query);
			
			rs = pstm.executeQuery();
			
			if(rs!=null) {
				while(rs.next()) {
					bList.add(new Board01(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4)));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		
		return bList;
	}
	
}
