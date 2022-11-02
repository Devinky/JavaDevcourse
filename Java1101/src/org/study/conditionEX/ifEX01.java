package org.study.conditionEX;

import java.util.Scanner;

public class ifEX01 {
	
	public static void main(String[] args) {
		
		System.out.println("조건이 하나일 때");
		
		String id = "m1234";
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("사용할 아이디를 입력하세요 : ");
		String userID = input.next();
		
		if(userID.equals(id)) {
			System.out.println("중복된 아이디입니다.");
		}
		
		if(!userID.equals(id)) {
			System.out.println("사용 가능한 아이디입니다.");
		}
		
		System.out.println("프로그램을 종료합니다.");
		input.close();
		
		
		
	}

}
