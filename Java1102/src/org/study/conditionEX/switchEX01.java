package org.study.conditionEX;

import java.util.Scanner;

public class switchEX01 {
	
	public static void main(String[] args) {
		System.out.println("Switch");
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("key값을 입력하세요 : ");
		int key = input.nextInt();
		
		switch(key) {
		case 1: 
			System.out.println("관리자 로그인");
			break;
		case 2:
			System.out.println("중간관리자 로그인");
			break;
		case 3:
			System.out.println("일반사원 로그인");
			break;
		default:
			System.out.println("접속불가. 관리자에게 문의하세요.");
			
		}
	}

}
