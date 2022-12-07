package org.project.commend;

import java.util.List;
import java.util.Scanner;

import org.project.dao.MemberDao;
import org.project.dto.Member1207;

public class MemberSelectAgeDo implements MemberCommend {

	@Override
	public void excuteQueryCommend() {
		System.out.println("조건에 맞는 회원정보 조회");
		

		Scanner input = new Scanner(System.in);
		
		System.out.print("몇 세부터? ");
		int startAge = input.nextInt();
		
		System.out.print("몇 세까지? ");
		int endAge = input.nextInt();

		MemberDao dao = new MemberDao();
		List<Member1207> agelist = dao.SelectAge(startAge, endAge);
		
		if(agelist!=null) {
			System.out.println("\n" + startAge + "세 ~ " + endAge + "세에 해당하는 회원");
			for(Member1207 user: agelist) {
				System.out.print("아이디: " + user.getUserId()+" | ");
				System.out.print("비밀번호: " + user.getUserPw()+" | ");
				System.out.print("연령: " + user.getAge()+" | ");
				System.out.println("이메일: " + user.getEmail());
				}			
			}else {
				System.out.println("회원조회 Fail!!");
			}
	}

}
