package org.study.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import org.study.dto.MemberDto;

public class MemberController03 {

	public static void main(String[] args) {

		// Scanner 이용, 아이디 비밀번호 이메일 나이 입력받기
		// exit가 입력되면 회원가입 종료

		ArrayList<MemberDto> lists = new ArrayList<MemberDto>();

		lists.add(new MemberDto("inky1", "i1234", "dd@email.com", 20));
		
		String userId = lists.get(0).getUserId();
		String userPw = lists.get(0).getUserPw();

		Scanner input = new Scanner(System.in);
		
		System.out.print("아이디를 입력하세요 : ");
		String id = input.next();
		System.out.print("비밀번호를 입력하세요 : ");
		String pw = input.next();
		
		if(userId.equals(id)&&userPw.equals(pw)) {
			System.out.println("Login Success");
		}else {
			System.out.println("Login Fail");
		}
		
		input.close();
	}

}
