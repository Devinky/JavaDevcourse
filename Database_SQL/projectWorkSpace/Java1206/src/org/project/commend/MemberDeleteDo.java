package org.project.commend;

import java.util.Scanner;

import org.project.dao.MemberDao;

public class MemberDeleteDo implements MemberCommend {

	@Override
	public void excuteQueryCommend() {
		System.out.println("회원탈퇴");
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("회원탈퇴 하시겠습니까?(yes or no) ");
		String ans = input.next();
		
		if(ans.equals("yes")) {
			System.out.print("탈퇴할 아이디 : ");
			String userId = input.next();

			MemberDao dao = new MemberDao();
			int result = dao.DeleteDo(userId);
			
			System.out.println("결과 : " + result);
			if(result!=1) {
				System.out.println("회원탈퇴 실패. 당신은 영원히 우리 회원이에요.");
			}else {
				System.out.println("회원탈퇴 성공. 언젠가 또 만나요^^");
			}
		}else if(ans.equals("no")) {
			System.out.println("탈퇴를 종료합니다.");
		}else {
			System.out.println("다시 입력하세요");
		}
	}
	
}
