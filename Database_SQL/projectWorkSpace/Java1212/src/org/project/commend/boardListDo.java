package org.project.commend;

import java.util.ArrayList;
import java.util.Scanner;

import org.project.dao.Dao;
import org.project.dto.BoardDto;

public class boardListDo implements ExecuteCommend {

	@Override
	public void executeQueryCommend() {
		System.out.println("회원 글 목록 조회");
		
		Dao dao = Dao.getInstance();

		Scanner input = new Scanner(System.in);
		
		System.out.print("조회할 아이디 : ");
		String userId = input.next();
		
		ArrayList<BoardDto> bList = dao.boardListDo(userId);
		
		if(bList!=null) {
			System.out.println(userId + " 회원의 글 목록");
			for(BoardDto list: bList) {
				System.out.print("글 번호 : " + list.getNo() + " | ");
				System.out.print("글 제목 : " + list.getbTitle() + " | ");
				System.out.print("글 내용 : " + list.getbContent() + " | ");
				System.out.print("작성자 : " + list.getNickName() + " | ");
				System.out.print("작성일 : " + list.getBTime() + " | ");
				System.out.print("ID : " + list.getbWriterId() + " | ");
			}
		}else {
			System.out.println("조회할 게시글이 없습니다.");
		}
		
	}

}
