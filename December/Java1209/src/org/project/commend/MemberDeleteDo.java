package org.project.commend;

import java.util.Scanner;

import org.project.dao.MemberDao;

public class MemberDeleteDo implements MemberCommend {

	@Override
	public void excuteQueryCommend() {
		System.out.println("회원탈퇴");
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("탈퇴하시겠습니까?(yes or no) ");
		String ans = input.next();
		
		if(ans.equals("yes")) {
			System.out.print("탈퇴할 아이디: ");
			String userId = input.next();
			
			MemberDao dao = new MemberDao();
			int result = dao.DeleteDo(userId);
			
			System.out.println("결과: " + result);
			if(result!=1) {
				System.out.println("탈퇴 실패. 영원히 저희 회원입니다.");
			}else {
				System.out.println("탈퇴되었습니다. 또 만나요^^");
			}
		}
	}

}
