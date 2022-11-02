package org.study.OperatorEx;

import java.util.Scanner;

public class LoginEX {
	
	public static void main(String[] args) {
		//id, pw를 scanner 입력 받기
		//id가 일치하면 "아이디가 일치합니다."
		//pw가 일치하면 "비밀번호가 일치합니다."
		//콘솔에 출력하는 프로그램을 만들기
		//if문, equals, System.out.print(), Scanner이용하기
		
		String userID = "m1234";
		String userPW = "1111";
		
		Scanner scn = new Scanner(System.in);
		System.out.print("ID를 입력하세요 : ");
		String id = scn.nextLine();
		
		System.out.print("Password를 입력하세요 : ");
		String pw = scn.nextLine();
		
		if(userID.equals(id)) {
			System.out.println("ID가 일치합니다.");
		}else {
			System.out.println("ID가 일치하지 않습니다.");
		}
		if(userPW.equals(pw)) {
			System.out.println("PW가 일치합니다.");
		}else {
			System.out.println("PW가 일치하지 않습니다.");
		}
		
		scn.close();
				
	}

}
