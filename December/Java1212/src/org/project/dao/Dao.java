package org.project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.project.dbconnect.DBConnect;
import org.project.dto.BoardDto;
import org.project.dto.MemberDto;

public class Dao {
	//싱글톤패턴
	//Dao 객체를 한번만 생성할 수 있다
	private static final Dao INSTANCE = new Dao();
	//반드시 객체를 생성해야함(?)
	
	//생성자 private
	private Dao() {
		System.out.println("기본생성자");
	}
	
	public static Dao getInstance() {
		return INSTANCE;
	}

	public int insertDo(String userId, String userPw, String email) {
		int result = 0;
		
		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";
		
		try {
			conn = DBConnect.getConnection();
			query = "insert into member1212(userId, userPw, email) values(?,?,?)";
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
	
	public List<MemberDto> selectDo() {
		List<MemberDto> list = new ArrayList<MemberDto>();
		
		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";
		ResultSet rs = null;
		
		try {
			conn = DBConnect.getConnection();
			query = "select * from member1212";
			pstm = conn.prepareStatement(query);
			rs = pstm.executeQuery();
			
			if(rs!=null) {
				while(rs.next()) {
					String userId = rs.getString(1);
					String userPw = rs.getString(2);
					String email = rs.getString(3);
					
					list.add(new MemberDto(userId, userPw, email));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	//접근제한자 리턴타입 메서드이름(매개변수(메서드를 실행할 때 필요한 데이터)
	public int loginOkDo(String userId, String userPw) {
		int result = 0; //리턴값
		
		Connection conn = null; //Connection타입의 DB연결 객체
		PreparedStatement pstm = null; //쿼리문 처리 객체
		String query = ""; //쿼리문
		ResultSet rs = null; //테이블을 받아올 때 사용하는 객체
		
		try {
			conn = DBConnect.getConnection(); //DB연동
			query = "select count(*) from member1212 where userid=? and userpw=?"; //쿼리문
			pstm = conn.prepareStatement(query); //쿼리문을 conn에 담아 DB로 보냄
			//커넥션 연결 - 쿼리문 실행
			
			pstm.setString(1, userId);
			pstm.setString(2, userPw);
			
			rs = pstm.executeQuery(); //select를 사용할 때 씀(테이블 가져올 때)
			//executeQuery는 리턴타입이 ResultSet이라 이걸 항상 써줘야 한다
			
//			pstm.executeUpdate(); insert, update, delete를 사용할 때 씀
			
			if(rs!=null) {
				while(rs.next()) {
					result = rs.getInt(1); 
					//select count(*)를 실행하면 가상테이블이 하나 생기고 이 테이블의 값은 int다
					//그래서 int로 받음
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
		
		return result; //이 모든 것들을 리턴값인 result로 반환한다
	}

	public int boardWriteDo(String bTitle, String bContent, String nickName, String bWriterId) {
		int result = 0;
		
		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";
		
		try {
			conn = DBConnect.getConnection();
			query = "insert into board1212(no, bTitle, bContent, nickName, bTime, bWriterId) "
					+ "values(board1212_sequence.nextval,?,?,?,sysdate,?)";
			pstm = conn.prepareStatement(query);
			
			pstm.setString(1, bTitle);
			pstm.setString(2, bContent);
			pstm.setString(3, nickName);
			pstm.setString(4, bWriterId);
			
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
	
	public List<BoardDto> boardSelectDo() {
		List<BoardDto> list = new ArrayList<BoardDto>();
		
		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";
		ResultSet rs = null;
		
		try {
			conn = DBConnect.getConnection();
			query = "select * from Board1212";
			pstm = conn.prepareStatement(query);
			rs = pstm.executeQuery();
			
			if(rs!=null) {
				while(rs.next()) {
					list.add(new BoardDto(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDate(5), rs.getString(6)));
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
		
		return list;
	}
	
	public ArrayList<BoardDto> boardListDo(String userId){
		ArrayList<BoardDto> bList = new ArrayList<BoardDto>();
		
		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";
		ResultSet rs = null;
		
		try {
			conn = DBConnect.getConnection();
			query = "select b.* from member1212 m inner join board1212 b on m.userid=b.bwriterid where m.userid=?";
			pstm = conn.prepareStatement(query);
			pstm.setString(1, userId); //얘는 executeQuery 위에다 선언해야함

			rs = pstm.executeQuery(); //최종적으로 실행
			
			if(rs!=null) {
				while(rs.next()) {
					bList.add(new BoardDto(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDate(5), rs.getString(6)));
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
		
		return bList;
	}
	
}
