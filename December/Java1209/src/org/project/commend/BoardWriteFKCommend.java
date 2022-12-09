package org.project.commend;

import java.util.Scanner;

import org.project.dao.MemberDao;

public class BoardWriteFKCommend implements MemberCommend {

	@Override
	public void excuteQueryCommend() {
		System.out.println("게시글 작성");
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("제목 : ");
		String bTitle = input.next();
		
		System.out.print("내용 : ");
		String bContent = input.next();
		
		System.out.print("작성자 아이디 : ");
		String bWritteId = input.next();
		
		MemberDao dao = new MemberDao();
		int result = dao.BoardWriteFKDo(bTitle, bContent, bWritteId);
		
		System.out.println("결과 : " + result);
		
		if(result!=1) {
			System.out.println("회원만 글을 작성할 수 있습니다.");
		}else {
			System.out.println("업로드 성공!");
		}
	}

}
