package org.study.DBMemberController;

import java.util.Scanner;

import org.study.DBMemberCommend.*;
import org.study.DBMemberDto.MemberDTO;

public class MemberController {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("아이디 입력 : ");
		String userID = input.next();
		System.out.println("비밀번호 입력 : ");
		String userPW = input.next();
		System.out.println("나이 입력 : ");
		int userAge = input.nextInt();
		System.out.println("이름 : ");
		String userName = input.next();
		System.out.println("주소 : ");
		String useAddr = input.next();
		
		MemberJoinCommend commend1 = new MemberJoinCommend();
		MemberJoinCommend commend2 = new MemberJoinCommend("제목1");
		
		//회원가입 MemberDTO
		//userID가 중복되지 않게
		MemberDTO member1 = new MemberDTO("m11", "11", 12, "inky", "서울시");
		MemberDTO member2 = new MemberDTO("m12", "11", 12, "inky", "서울시");
		MemberDTO member3 = new MemberDTO("m13", "11", 12, "inky", "서울시");
		MemberDTO member4 = new MemberDTO("m14", "11", 12, "inky", "서울시");
		MemberDTO member5 = new MemberDTO("m15", "11", 12, "inky", "서울시");
		
		/*
		String userID = member1.getUserID();
		String userPW = member1.getUserPW();
		
		System.out.println(userID);
		System.out.println(userPW);
		*/
		if(userID.equals("m111") && userPW.equals("1111")) {
			System.out.println("로그인 성공");			
		}else {
			System.out.println("로그인 실패.");
		}
		
		member1.getMemberDTO();
		member2.getMemberDTO();
		member3.getMemberDTO();
		member4.getMemberDTO();
		member5.getMemberDTO();
		
		
		System.out.println(member1.getUserID());
		System.out.println(member1.getUserPW());
		System.out.println(member1.getUserAge());
		System.out.println(member1.getUserName());
		System.out.println(member1.getUserAddr());
		
	}
	

}
