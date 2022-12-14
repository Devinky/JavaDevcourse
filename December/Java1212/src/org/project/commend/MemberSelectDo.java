package org.project.commend;

import java.util.List;

import org.project.dao.Dao;
import org.project.dto.MemberDto;

public class MemberSelectDo implements ExecuteCommend {

	@Override
	public void executeQueryCommend() {
		System.out.println("회원목록 조회");
		
		Dao dao = Dao.getInstance();
		
		List<MemberDto> users = dao.selectDo();
		
		if(users!=null) {
			System.out.println("==========회원목록==========");
			for(MemberDto user: users) {
				System.out.print(user.getUserId()+" ");
				System.out.print(user.getUserPw()+" ");
				System.out.println(user.getEmail());
			}
			System.out.println("=========================");
		}else {
			System.out.println("조회할 회원이 없습니다.");
		}
	}

}
