package org.study.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.study.dbconnect.DBConnect;
import org.study.dto.MemberDto;

public class MemberDao {
	
	public MemberDao() {
		System.out.println("기본생성자");
	}
	  
	//회원가입 return값을 정수로 받아야 함(정수1 = 성공)
	public int insertDo(String userId, String userPw, int age) {
		System.out.println(userId + " " + userPw + "  " + age);
		int result = 0;
		
		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";
		
		//1.DB연동
		try {
			conn = DBConnect.getConnection();				//preparedStatment
			query = "insert into member(userId,userPw,age) values(?,?,?)";
			//DB연동, SQL처리
			pstm = conn.prepareStatement(query); //DB에 연결하고, 쿼리문을 처리해주는 것
			//DB 테이블을 추가
			pstm.setString(1, userId); //setString(인덱스(1~), 값)
			pstm.setString(2, userPw);
			pstm.setInt(3, age);
		
			//실행
			result = pstm.executeUpdate(); //성공이면 정수1반환 , 수정, 삭제, 추가
			
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
	
	//회원조회 return 객체(DTO), null
	public ArrayList<MemberDto> selectDo() {
		
		ArrayList<MemberDto> lists = new ArrayList<MemberDto>();
		
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null; //DB데이터를 저장할 객체
		String query = "";
		
		try {
			conn = DBConnect.getConnection();
			query = "select * from member";
			pstm = conn.prepareStatement(query);
			rs = pstm.executeQuery(); //DB 데이터를 저장
			
			if(rs!=null) {
				//DB데이터가 없으면 null
				while(rs.next()) {
					//레코드1 get
					//rs.getString(1)
					String userId = rs.getString(1);
					String userPw = rs.getString(2);
					int age = rs.getInt(3);
					
					lists.add(new MemberDto(userId, userPw, age));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return lists;
		
	}
	
	//회원수정 return 정수1(성공)
	public int updateDo(String userId, String userPw, int age) {
		//SQL문과 다르고 나머지는 회원가입과 같다
		System.out.println(userId + " " + userPw + "  " + age);
		int result = 0;
		
		Connection conn = null; //DBConnect와 연결용도
		PreparedStatement pstm = null; //DB연동하고 SQL문을 처리해주는 용도
		
		String query = ""; //SQL문을 넣을 용도
		
		try {
			conn = DBConnect.getConnection();
			query = "update member set userPw=?, age=? where userId=?";
			//query를 SQL문으로 처리
			pstm = conn.prepareStatement(query);
			//SQL설정
			pstm.setString(1, userPw);
			pstm.setInt(2, age);
			pstm.setString(3, userId);
			//PreparedStatement 실행
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

	//회원탈퇴	return 정수1(성공)
	public int deleteDo(String userId) {
		System.out.println(userId);
		int result = 0;
		
		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";
		
		try {
			conn = DBConnect.getConnection();
			query = "delete from member where userId=?";
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


