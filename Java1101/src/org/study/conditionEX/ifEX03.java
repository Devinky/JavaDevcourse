package org.study.conditionEX;

import java.util.Scanner;

public class ifEX03 {
	
	public static void main(String[] args) {
		
		System.out.println("조건이 둘일 때");
		//아이디, 비밀번호를 입력 받아서
		//아이디와 비밀번호가 모두 일치하면 로그인 성공
		//하나라도 틀리면 로그인 실패를 콘솔에 출력
		
		String id = "m1234";
		String pw = "k1234";
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Login ID : ");
		String userID = input.next();
		System.out.println("Login PW : ");
		String userPW = input.next();
		
		if(userID.equals(id) && userPW.equals(pw)) {
			System.out.println("로그인되었습니다.");
		} else {
			System.out.println("아이디와 비밀번호를 확인해주세요.");
		}
		
		/* 이런 방법도 있음
		if(!userID.equals(id) || !userPW.equals(pw)) {
			System.out.println("아이디와 비밀번호를 확인해주세요.");
		} else {
			System.out.println("로그인되었습니다.");
		}
		*/
		
		input.close();
		
		
		
	}

}
