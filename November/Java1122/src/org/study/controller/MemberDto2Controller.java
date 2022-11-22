package org.study.controller;

import java.util.ArrayList;
import java.util.Scanner;

import org.study.dto.MemberDto2;

public class MemberDto2Controller {

	public static void main(String[] args) {

		/*
		 * while, ArrayList, Scanner, MemberDto2등 1.회원가입: 아이디, 이메일, 전화번호, 나이(int) 5명 입력
		 * 후 전체 회원 출력 2.로그인 : -> 성공시: ArrayList에 저장된 MemberDto2요소의 userId,email이 같으면
		 * "로그인 성공" -> 실패시: ArrayList에 저장된 MemberDto2요소의 userId,email이 같으면 "로그인 실패"
		 */

		ArrayList<MemberDto2> userlist = new ArrayList<MemberDto2>();

		while (true) {

			Scanner input = new Scanner(System.in);
			System.out.println("회원가입 시스템 실행");

			int num = 0;

			if (num < 5) {

				System.out.print("아이디를 입력하세요 : ");
				String userId = input.next();
				System.out.print("이메일을 입력하세요 : ");
				String eamil = input.next();
				System.out.print("전화번호를 입력하세요 : ");
				String phone = input.next();
				System.out.print("나이를 입력하세요 : ");
				int age = input.nextInt();

				userlist.add(new MemberDto2(userId, eamil, phone, age));

				num++;
			}

			for (int i=0; i<userlist.size(); i++) {
				
				System.out.println("아이디: " + userlist.get(i).getUserId() + " " + "이메일 : " + userlist.get(i).getEmail() + " "
						+ "전화번호 : " + userlist.get(i).getPhone() + " " + "나이 : " + userlist.get(i).getAge());
			}
		}
	}

}
