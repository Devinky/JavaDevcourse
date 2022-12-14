package org.project.commend;

import java.util.Scanner;

import org.project.dao.Dao;

public class MemberInsertDo implements ExecuteCommend {

	@Override
	public void executeQueryCommend() {
		System.out.println("회원가입");
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("아이디 : ");
		String userId = input.next();
		
		System.out.print("비밀번호 : ");
		String userPw = input.next();
		
		System.out.print("이메일 : ");
		String email = input.next();
		
		//싱글톤 패턴 -> 객체를 한번만 생성
		Dao dao = Dao.getInstance();
		
		int result = dao.insertDo(userId, userPw, email);
		System.out.println("회원가입 결과 : " + result);
		
		if(result!=1) {
			System.out.println("회원가입 실패. 다시 시도해주세요.");
		}else {
			System.out.println("회원가입 성공. 환영합니다.");
		}
	}

}
