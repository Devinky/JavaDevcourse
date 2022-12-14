package org.project.commend;

import java.util.Scanner;

import org.project.dao.MemberDao;

public class BoardWrite implements MemberCommend {

	@Override
	public void excuteQueryCommend() {
		System.out.println("게시글 작성");
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("글 번호 : ");
		int bId = input.nextInt();
		
		System.out.print("작성자ID : ");
		String writeId = input.next();
		
		System.out.print("글 내용 : ");
		String bContent = input.next();

		MemberDao dao = new MemberDao();
		int result = dao.BoardWriteDo(bId, writeId, bContent);
		
		System.out.println("회원가입 결과 : " + result);
		
		if(result!=1) {
			System.out.println("게시글 작성 실패.");
		}else {
			System.out.println("게시글 작성 성공.");
		}
	}

}
