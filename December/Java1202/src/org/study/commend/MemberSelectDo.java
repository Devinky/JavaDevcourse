package org.study.commend;

import java.util.ArrayList;

import org.study.dao.MemberDao;
import org.study.dto.MemberDto;

public class MemberSelectDo implements ExcuteCommend {

	@Override
	public void excuteCommend() {
		System.out.println("회원조회");
		
		MemberDao dao = new MemberDao();
		ArrayList<MemberDto> userlist = dao.selectDo();
		
		if(userlist!=null) {
			System.out.println("회원목록을 출력합니다");
			for(MemberDto list: userlist) {
				System.out.println("아이디 : " + list.getUserId() + " / 비밀번호 : " + list.getUserPw()
								+ " / 나이: " + list.getAge() + " / 이메일 : " + list.getEmail());
			}
		}else {
			System.out.println("회원조회 실패");
		}
		
	}

}
