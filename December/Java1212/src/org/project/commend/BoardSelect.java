package org.project.commend;

import java.util.List;

import org.project.dao.Dao;
import org.project.dto.BoardDto;

public class BoardSelect implements ExecuteCommend {

	@Override
	public void executeQueryCommend() {
		System.out.println("게시글 목록");
		
		Dao dao = Dao.getInstance();
		
		List<BoardDto> list = dao.boardSelectDo();
		
		if(list!=null) {
			for(BoardDto lists: list) {
				System.out.print("글 번호 : " + lists.getNo() + " | ");
				System.out.print("글 제목 : " + lists.getbTitle() + " | ");
				System.out.print("글 내용 : " + lists.getbContent() + " | ");
				System.out.print("작성자 : " + lists.getNickName() + " | ");
				System.out.print("작성일 : " + lists.getBTime() + " | ");
				System.out.println("ID : " + lists.getbWriterId());
			}
		}else {
			System.out.println("조회할 게시글이 없습니다.");
		}
	}
}
