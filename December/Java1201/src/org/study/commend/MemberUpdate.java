package org.study.commend;

import java.util.Scanner;

import org.study.dao.MemberDao;

public class MemberUpdate implements ExcuteCommend {
	
	@Override
	public void excuteQueryCommend() {
		System.out.println("회원수정");
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("아이디 : ");
		String userId = input.next();
		
		System.out.print("비밀번호 : ");
		String userPw = input.next();
		
		System.out.print("나이 : ");
		int age = input.nextInt();
		
		MemberDao dao = new MemberDao();
		int result = dao.updateDo(userId, userPw, age);
		
		System.out.println("result " + result);
		if(result!=1) {
			System.out.println("회원수정 실패");
		}else {
			System.out.println("회원수정 성공");
		}
		
	}

}
