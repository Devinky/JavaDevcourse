package org.study.OperatorEx;

import java.util.Scanner;

public class operator05 {
	
	public static void main(String[] args) {
		
		System.out.println("조건연산자");
		
		/*
							//조건1 && 조건2 - 모든 조건이 true일때만 true를 return
		System.out.println(userID.equals("m1234") && userPW.equals("1111"));
		System.out.println(userID.equals("m1234") && userPW.equals("2222"));
		System.out.println(userID.equals("m2345") && userPW.eEquals("1111"));
		System.out.println(userID.equals("m2345") && userPW.equals("2222"));
		System.out.println("==============================================");
		
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		System.out.println("==============================================");
		
		//ID, PW가 동시에 일치하면 "로그인 성공", 그렇지 않으면 "로그인 실패"
		//콘솔에 출력하기
		//Scanner, 아이디 -> id, 비밀번호 -> pw 입력받기
		//userID, userPW가 동시에 일치하는 코드를 짜보기
		// && 조건문과 if~else 사용하기
		 */

		String userid = "devinky";
		String userpw = "1234";
		
		Scanner scn = new Scanner(System.in);
		System.out.print("ID를 입력하세요 : ");
		String id = scn.next();		
		
		System.out.print("Password를 입력하세요 : ");
		String pw = scn.next();
		
		if(userid.equals(id) && userpw.equals(pw)) {
			System.out.println("로그인 되었습니다.");
		}else {
			System.out.println("로그인 실패. ID와 Password를 확인해주세요.");
		}
		
	}

}
