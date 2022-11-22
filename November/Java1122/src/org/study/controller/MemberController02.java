package org.study.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import org.study.dto.MemberDto;

public class MemberController02 {

	public static void main(String[] args) {

		// Scanner 이용, 아이디 비밀번호 이메일 나이 입력받기
		// exit가 입력되면 회원가입 종료

		ArrayList<MemberDto> lists = new ArrayList<MemberDto>();

		Scanner input = new Scanner(System.in);
		
		while (true) {
			System.out.println("회원가입을 실행하시겠습니까? ");
			String ans = input.next();
			if (ans.equals("exit")) {
				System.out.println("회원가입을 종료합니다.");
				break;
			} else {
				System.out.print("아이디를 입력하세요 : ");
				String userId = input.next();
				System.out.print("비밀번호를 입력하세요 : ");
				String userPw = input.next();
				System.out.print("이메일을 입력하세요 : ");
				String email = input.next();
				System.out.print("나이를 입력하세요 : ");
				int age = input.nextInt();
				
				lists.add(new MemberDto(userId, userPw, email, age));
			}
			System.out.println("\n가입정보 확인");
			for (MemberDto list : lists) {
				System.out.println("아이디 : " + list.getUserId() + " | " + "비밀번호 : " + list.getUserPw() + " | " + "이메일 : "
						+ list.getEmail() + " | " + "나이 : " + list.getAge());			
			}
			input.close();
		}

	}

}
