package org.study.commend;

import java.util.Scanner;

import org.study.dao.MemberDao;

public class MemberInsert implements ExcuteCommend {
	
	@Override
	public void excuteQueryCommend() {
		System.out.println("회원가입");
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("아이디 : ");
		String userId = input.next();
		
		System.out.println("비밀번호 : ");
		String userPw = input.next();
		
		System.out.println("나이 : ");
		int age = input.nextInt();
		
		MemberDao dao = new MemberDao();
		int result = dao.insertDo(userId, userPw, age);
		
		System.out.println("resutl "+result);
		if(result!=1) {
			System.out.println("회원가입 실패");
		}else {
			System.out.println("회원가입 성공");
		}
	}

}
