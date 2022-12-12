package org.project.commend;

import java.util.Scanner;

import org.project.dao.MemberDao;

public class MemberSerchIdDo implements MemberCommend {

	@Override
	public void excuteQueryCommend() {
		System.out.println("검색");
		
		MemberDao dao = new MemberDao();
		
		Scanner input = new Scanner(System.in);
		System.out.print("검색 아이디 입력: ");
		String userId = input.next();
		
	}

}
