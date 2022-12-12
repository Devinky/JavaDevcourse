package org.project.commend;

import java.util.List;
import java.util.Scanner;

import org.project.dao.MemberDao;
import org.project.dto.Member01;

public class MemberSort implements MemberCommend {

	@Override
	public void excuteQueryCommend() {
		System.out.println("회원정렬");
		//아이디별 내림차순 조회
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("정렬 방법(desc or asc): ");
		String ans = input.next();
		
		MemberDao dao = new MemberDao();
		List<Member01> lists = dao.sortDo(ans);

		if(ans.equals("desc")) {
			if(lists!=null) {
				System.out.println("\n회원목록 내림차순 정렬");
				System.out.println("=======================================================");
				for(Member01 list: lists) {
					System.out.print("아이디: " + list.getUserId() + " | ");
					System.out.print("비밀번호: " + list.getUserPw()+ " | ");
					System.out.println("이메일: " + list.getEmail());
				}
				System.out.println("=======================================================");
			}
		}else if(ans.equals("asc")) {
			if(lists!=null) {
				System.out.println("\n회원목록 오름차순 정렬");
				System.out.println("=======================================================");
				for(Member01 list: lists) {
					System.out.print("아이디: " + list.getUserId() + " | ");
					System.out.print("비밀번호: " + list.getUserPw()+ " | ");
					System.out.println("이메일: " + list.getEmail());
				}
				System.out.println("=======================================================");
			}
		}else {
			System.out.println("입력 오류. 다시 입력해주세요.");
		}
		
	}
	
}
