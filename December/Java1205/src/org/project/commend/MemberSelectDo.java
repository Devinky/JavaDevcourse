package org.project.commend;

import java.util.List;
import org.project.dao.MemberDao;
import org.project.dto.MemberDto;

public class MemberSelectDo implements MemberCommend {

	@Override
	public void excuteQueryCommend() {
		System.out.println("회원목록 조회");
		
		MemberDao dao = new MemberDao();
		List<MemberDto> userlist = dao.SelectDo();
		
		if(userlist!=null) {
			System.out.println("========================회원목록==========================");
			for(MemberDto list: userlist) {
				System.out.println("아이디 : " + list.getUserId() + " | 비밀번호 : " + list.getUserpW() 
				+ " | 나이: " + list.getAge() + " | 이메일 : " + list.getEmail());
			}
			System.out.println("========================================================");
		}else {
			System.out.println("회원목록 조회 실패");
		}
	}
	
}
