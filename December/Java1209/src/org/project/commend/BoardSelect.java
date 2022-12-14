package org.project.commend;

import java.util.List;

import org.project.dao.MemberDao;
import org.project.dto.Board01;

public class BoardSelect implements MemberCommend {

	@Override
	public void excuteQueryCommend() {
		System.out.println("게시글 목록");
		
		MemberDao dao = new MemberDao();
		
		List<Board01> blist = dao.BoardSelectDo();
		
		if(blist!=null) {
			for(Board01 list: blist) {
				System.out.println("게시글 번호 : " + list.getbId());
				System.out.println("글 제목 : " + list.getbTitle());
				System.out.println("내용 : " + list.getbContent());
				System.out.println("작성자 : " + list.getbWriteId());
				System.out.println("======================");
			}
		}else {
			System.out.println("조회할 게시글이 없습니다.");
		}
	}

}
