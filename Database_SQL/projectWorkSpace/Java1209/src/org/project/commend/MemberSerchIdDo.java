package org.project.commend;

import java.util.List;
import java.util.Scanner;

import org.project.dao.MemberDao;
import org.project.dto.Member01;

public class MemberSerchIdDo implements MemberCommend {

	@Override
	public void excuteQueryCommend() {
		System.out.println("아이디 검색");
		//검색한 문자가 포함되어 있는 레코드를 출력
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("검색할 아이디 입력: ");
		String userId = input.next();
		
		MemberDao dao = new MemberDao();
		List<Member01> lists = dao.SerchIdDo(userId);
		
		if(lists!=null) {
			System.out.println("\n" + userId + "이(가) 포함된 검색결과");
			for(Member01 list: lists) {
				System.out.print("아이디: " + list.getUserId() + " | ");
				System.out.print("비밀번호: " + list.getUserPw() + " | ");
				System.out.println("이메일: " + list.getEmail());
			}
		}else {
			System.out.println("검색 결과가 없습니다.");
		}
		
	}

}
