package org.study.controller;

import java.util.ArrayList;
import java.util.Scanner;

import org.study.dto.MemberDto2;

public class MemberDto2Controller {

	public static void main(String[] args) {

		/*
		 * while, ArrayList, Scanner, MemberDto2등 1.회원가입: 아이디, 이메일, 전화번호, 나이(int) 5명 입력 후 전체 회원 출력
		 * 2.로그인 : -> 성공시: ArrayList에 저장된 MemberDto2요소의 userId,email이 같으면 "로그인 성공"
		 * 			-> 실패시: ArrayList에 저장된 MemberDto2요소의 userId,email이 같으면 "로그인 실패"
		 */

		ArrayList<MemberDto2> userlist = new ArrayList<MemberDto2>();
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("회원가입 실행\n");

		for(int i=0;i<5;i++) {			
			System.out.println((i+1)+"번째 회원");
			System.out.print("아이디를 입력하세요 : ");
			String userId = input.next();
			System.out.print("이메일을 입력하세요 : ");
			String email = input.next();
			System.out.print("전화번호를 입력하세요 : ");
			String phone = input.next();
			System.out.print("나이를 입력하세요 : ");
			int age = input.nextInt();
			
			userlist.add(new MemberDto2(userId, email, phone, age));
			System.out.println();			
		}
		
		System.out.println("\n회원목록\n");
		
		for (int i2=0;i2<userlist.size();i2++) {			
			System.out.println("UserNo." + (i2+1) + " - " + "아이디: " + userlist.get(i2).getUserId() + " | " + " " 
					+ "이메일 : " + userlist.get(i2).getEmail() + " | " + " "
					+ "전화번호 : " + userlist.get(i2).getPhone() + " | " + " " 
					+ "나이 : " + userlist.get(i2).getAge());	
		}
				
		System.out.println("\n로그인을 하세요\n");
		
		System.out.print("아이디 : ");
		String loginId = input.next();
		System.out.print("이메일 : ");
		String loginEmail = input.next();
		System.out.println();
		
		if(loginId.equals(userlist.get(0).getUserId()) && loginEmail.equals(userlist.get(0).getEmail())) {
			System.out.println("로그인 성공");
		}else if(loginId.equals(userlist.get(1).getUserId()) && loginEmail.equals(userlist.get(1).getEmail())){
			System.out.println("로그인 성공");
		}else if(loginId.equals(userlist.get(2).getUserId()) && loginEmail.equals(userlist.get(2).getEmail())) {
			System.out.println("로그인 성공");
		}else if(loginId.equals(userlist.get(3).getUserId()) && loginEmail.equals(userlist.get(3).getEmail())) {
			System.out.println("로그인 성공");
		}else if(loginId.equals(userlist.get(4).getUserId()) && loginEmail.equals(userlist.get(4).getEmail())) {
			System.out.println("로그인 성공");
		}else {
			System.out.println("로그인 실패");
		}
	
		input.close();
		
	}

}
