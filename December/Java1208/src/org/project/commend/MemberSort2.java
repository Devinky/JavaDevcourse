package org.project.commend;

import java.util.List;
import java.util.Scanner;

import org.project.dao.MemberDao;
import org.project.dto.Member1207;

public class MemberSort2 implements MemberCommend {

	@Override
	public void excuteQueryCommend() {
		System.out.println("선택정렬");

		Scanner input = new Scanner(System.in);

		System.out.print("정렬 기준 필드: ");
		String userInfo = input.next();

		System.out.print("정렬방법(desc or asc): ");
		String sort = input.next();

		MemberDao dao = new MemberDao();
		List<Member1207> userlist = dao.sort2Do(userInfo, sort);
		
		if (userlist != null) {
			for (Member1207 list : userlist) {
				System.out.print("아이디: " + list.getUserId() + " | ");
				System.out.print("비밀번호: " + list.getUserPw() + " | ");
				System.out.print("연령: " + list.getAge() + " | ");
				System.out.println("이메일: " + list.getEmail());
			}
		}else {
			System.out.println("회원 조회 실패. 다시 시도해주세요.");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

//		if (userInfo.equals("userId")) {
//			if (sort.equals("desc")) {
//				if (userlist != null) {
//					for (Member1207 list : userlist) {
//						System.out.print("아이디: " + list.getUserId() + " | ");
//						System.out.print("비밀번호: " + list.getUserPw() + " | ");
//						System.out.print("연령: " + list.getAge() + " | ");
//						System.out.println("이메일: " + list.getEmail());
//					}
//				}
//			} else if (sort.equals("asc")) {
//				if (userlist != null) {
//					for (Member1207 list : userlist) {
//						System.out.print("아이디: " + list.getUserId() + " | ");
//						System.out.print("비밀번호: " + list.getUserPw() + " | ");
//						System.out.print("연령: " + list.getAge() + " | ");
//						System.out.println("이메일: " + list.getEmail());
//					}
//				}
//			}
//		} else if (userInfo.equals("userPw")) {
//			if (sort.equals("desc")) {
//				if (userlist != null) {
//					for (Member1207 list : userlist) {
//						System.out.print("아이디: " + list.getUserId() + " | ");
//						System.out.print("비밀번호: " + list.getUserPw() + " | ");
//						System.out.print("연령: " + list.getAge() + " | ");
//						System.out.println("이메일: " + list.getEmail());
//					}
//				}
//			} else if (sort.equals("asc")) {
//				if (userlist != null) {
//					for (Member1207 list : userlist) {
//						System.out.print("아이디: " + list.getUserId() + " | ");
//						System.out.print("비밀번호: " + list.getUserPw() + " | ");
//						System.out.print("연령: " + list.getAge() + " | ");
//						System.out.println("이메일: " + list.getEmail());
//					}
//				}
//			}
//		} else if (userInfo.equals("age")) {
//			if (sort.equals("desc")) {
//				if (userlist != null) {
//					for (Member1207 list : userlist) {
//						System.out.print("아이디: " + list.getUserId() + " | ");
//						System.out.print("비밀번호: " + list.getUserPw() + " | ");
//						System.out.print("연령: " + list.getAge() + " | ");
//						System.out.println("이메일: " + list.getEmail());
//					}
//				}
//			} else if (sort.equals("asc")) {
//				if (userlist != null) {
//					for (Member1207 list : userlist) {
//						System.out.print("아이디: " + list.getUserId() + " | ");
//						System.out.print("비밀번호: " + list.getUserPw() + " | ");
//						System.out.print("연령: " + list.getAge() + " | ");
//						System.out.println("이메일: " + list.getEmail());
//					}
//				}
//			}
//		} else if (userInfo.equals("email")) {
//			if (sort.equals("desc")) {
//				if (userlist != null) {
//					for (Member1207 list : userlist) {
//						System.out.print("아이디: " + list.getUserId() + " | ");
//						System.out.print("비밀번호: " + list.getUserPw() + " | ");
//						System.out.print("연령: " + list.getAge() + " | ");
//						System.out.println("이메일: " + list.getEmail());
//					}
//				}
//			} else if (sort.equals("asc")) {
//				if (userlist != null) {
//					for (Member1207 list : userlist) {
//						System.out.print("아이디: " + list.getUserId() + " | ");
//						System.out.print("비밀번호: " + list.getUserPw() + " | ");
//						System.out.print("연령: " + list.getAge() + " | ");
//						System.out.println("이메일: " + list.getEmail());
//					}
//				}
//			}
//		}
	}

}
