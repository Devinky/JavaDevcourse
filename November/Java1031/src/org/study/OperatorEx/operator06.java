package org.study.OperatorEx;

import java.util.Scanner;

public class operator06 {
	
	public static void main(String[] args) {
		
		System.out.println("조건연산자");
		
		String userID = "m1234";
		String userPW = "1111";
		
							//조건1 || 조건2 - 하나 이상의 조건이 true면 true를 return
		System.out.println(userID.equals("m1234") || userPW.equals("1111"));
		System.out.println(userID.equals("m1234") || userPW.equals("2222"));
		System.out.println(userID.equals("m2345") || userPW.equals("1111"));
		System.out.println(userID.equals("m2345") || userPW.equals("2222"));
		System.out.println("==============================================");
		
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		System.out.println("==============================================");
		System.out.println(!false);
		System.out.println(!true);
		
		Scanner scn = new Scanner(System.in);
		System.out.print("ID를 입력하세요 : ");
		String id = scn.next();		
		
		System.out.print("Password를 입력하세요 : ");
		String pw = scn.next();
		
		if(!userID.equals(id) || !userPW.equals(pw)) {
			System.out.println("아이디 혹은 비밀번호가 일치하지 않습니다.");
		}else {
			System.out.println("로그인 되었습니다.");
		}

		
		
	}

}
