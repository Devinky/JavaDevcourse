package org.study.basicPackage;

import java.util.Scanner;

public class Quiz221116 {
	
	public static void main(String[] args) {
		//String 타입의 변수 userID, userPW, userName을 선언하고
		//Scanner클래스를 이용해 초기화
		//concat(); 메서드를 이용해 합치기
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("아이디를 입력하세요 : ");
		String userID = input.next();
		String userID2 = "userID=".concat(userID);
		System.out.println(userID2);
		
		System.out.print("\n비밀번호를 입력하세요 : ");
		String userPW = input.next();
		String userPW2 = "userPW=".concat(userPW);
		System.out.println(userPW2);
		
		System.out.print("\n이름을 입력하세요 : ");
		String userName = input.next();
		String userName2 = "userName=".concat(userName);
		System.out.println(userName2);
		
		String s1 = userID2.concat("&");
		String s2 = userPW2.concat("&");
		String s3 = s1.concat(s2);
		String s4 = s3.concat(userName2);
		
		System.out.println(s4);
		
		input.close();
	}

}
