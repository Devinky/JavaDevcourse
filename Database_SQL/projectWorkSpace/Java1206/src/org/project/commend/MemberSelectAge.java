package org.project.commend;

import java.util.List;
import java.util.Scanner;

import org.project.dao.MemberDao;
import org.project.dto.Member1206;

public class MemberSelectAge implements MemberCommend {

	@Override
	public void excuteQueryCommend() {
		System.out.println("해당 나잇대의 회원 출력");
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("몇 세부터? ");
		int ageStart = input.nextInt();
		
		System.out.print("몇 세까지? ");
		int ageEnd = input.nextInt();
		
		MemberDao dao = new MemberDao();
		List<Member1206> userlist = dao.selectAge(ageStart, ageEnd);
		
		if(userlist!=null) {
			System.out.println(ageStart + "세에서 " + ageEnd + "세에 해당하는 회원 목록");
			for(Member1206 member: userlist) {
				System.out.println("아이디: " + member.getUserId()
				+ " | 비밀번호 : " + member.getUserpW() + " | 나이: " + member.getAge()
				+ " | 이메일: " + member.getEmail());
			}
		}else {
			System.out.println("조회할 데이터가 없습니다.");
		}
	}

}
