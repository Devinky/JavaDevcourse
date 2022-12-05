package org.project.commend;

import java.util.Scanner;

import org.project.dao.MemberDao;

public class MemberUpdateDo implements MemberCommend {

	@Override
	public void excuteQueryCommend() {
		System.out.println("회원정보 수정");
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("아이디를 입력하세요 : ");
		String userId = input.next();

		System.out.print("비밀번호 변경: ");
		String userPw = input.next();

		System.out.print("나이 변경: ");
		int age = input.nextInt();

		System.out.print("이메일 변경: ");
		String email = input.next();
		
		MemberDao dao = new MemberDao();
		int result = dao.UpdateDo(userId, userPw, age, email);
		
		if(result!=1) {
			System.out.println("변경 실패. 다시 시도해주세요.");
		}else {
			System.out.println("회원정보 수정 완료");
		}
	}
	
}
