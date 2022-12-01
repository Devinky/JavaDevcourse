package org.study.commend;

import java.util.ArrayList;

import org.study.dao.MemberDao;
import org.study.dto.MemberDto;

public class MemberSelect implements ExcuteCommend {

	@Override
	public void excuteQueryCommend() {
		System.out.println("회원조회");
		
		MemberDao dao = new MemberDao();
		ArrayList<MemberDto> lists = dao.selectDo();
		
		if(lists!=null) {
			System.out.println("회원목록을 출력합니다");
			//lists에 담긴 모든 요소 출력
			for(MemberDto list: lists) {
				System.out.println("Id: " + list.getUserId() + 
						" / Password: " + list.getUserPw() + 
						" / age: " + list.getAge());
			}
		}else {
			System.out.println("회원조회 실패");
		}
	}

}
