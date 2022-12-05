package org.project.commend;

import java.util.Scanner;

import org.project.dao.MemberDao;

public class MemberInsertDo implements MemberCommend {

	@Override
	public void excuteQueryCommend() {
		System.out.println("회원가입");
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("아이디 : ");
		String userId = input.next();
		
		System.out.print("비밀번호 : ");
		String userPw = input.next();
		
		System.out.print("나이 : ");
		int age = input.nextInt();
		
		System.out.print("이메일 : ");
		String email = input.next();
		
		MemberDao dao = new MemberDao();
		int result = dao.InsertDo(userId, userPw, age, email);
		
		System.out.println("결과 : " + result);
		if(result!=1) {
			System.out.println("회원가입 실패.");
		}else {
			System.out.println("회원가입이 완료되었습니다.");
		}
	}
	
}
