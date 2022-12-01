package org.study.commend;

import java.util.Scanner;

import org.study.dao.MemberDao;

public class MemberDelete implements ExcuteCommend {
	
	@Override
	public void excuteQueryCommend() {
		System.out.println("회원탈퇴");
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("탈퇴할 아이디 : ");
		String userId = input.next();
		
		MemberDao dao = new MemberDao();
		int result = dao.deleteDo(userId);
		
		System.out.println("result " + result);
		if(result!=1) {
			System.out.println("회원탈퇴 실패");
		}else {
			System.out.println("회원탈퇴 성공");
		}
	}

}
