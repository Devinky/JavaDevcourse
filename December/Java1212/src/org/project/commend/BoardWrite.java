package org.project.commend;

import java.util.Scanner;

import org.project.dao.Dao;

public class BoardWrite implements ExecuteCommend {

	@Override
	public void executeQueryCommend() {
		System.out.println("글 작성");
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("글 제목 : ");
		String bTitle = input.next();
		
		System.out.print("글 내용 : ");
		String bContent = input.next();
		
		System.out.print("작성자 : ");
		String nickName = input.next();
		
		System.out.print("아이디 : ");
		String bWriterId = input.next();
		
		Dao dao = Dao.getInstance();
		int result = dao.boardWriteDo(bTitle, bContent, nickName, bWriterId);
		
		if(result!=1) {
			System.out.println("회원만 글을 작성할 수 있습니다.");
		}else {
			System.out.println("작성 성공.");
		}
	}

}
