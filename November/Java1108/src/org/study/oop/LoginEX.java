package org.study.oop;

import java.util.Scanner;

public class LoginEX {
	public static void main(String[] args) {
		
		MemberDTOEX memb1 = new MemberDTOEX();
		Scanner input = new Scanner(System.in);

		String userID = "devinky";
		String userPW = "a1234";
		
		while(true) {
			System.out.println("로그인 하시겠습니까?");
			String ans2 = input.next();
			if(ans2.equals("no")) {
				System.out.println("창을 닫습니다.");
				break;
			}else if(ans2.equals("yes")) {
				System.out.println("아이디를 입력하세요 : ");
				memb1.setUserID(input.next());
				System.out.println("비밀번호를 입력하세요 : ");
				memb1.setUserPW(input.next());
				
				if(userID.equals(memb1.getUserID()) && userPW.equals(memb1.getUserPW())) {
					System.out.println("로그인 성공! 즐거운 쇼핑되세요.");
					break;
				}else{
					System.out.println("로그인 실패. 아이디와 비밀번호를 확인해주세요.\n");
				}
			}else {
				System.out.println("입력 오류. yes or no로 입력해주세요.\n");
			}
		}
		input.close();
	}

}
