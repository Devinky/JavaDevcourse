package org.study.basicPackage;

import java.util.Scanner;

public class StringEXQuiz {

	public static void main(String[] args) {
		System.out.println("회원 프로그램 실행\n");

		Scanner input = new Scanner(System.in);

		while (true) {

			System.out.print("url을 입력하세요 : ");
			String url = input.next();
			String query = url.substring(0, url.length() - 3);

			if (url.substring(url.length() - 3).equals(".do")) {
				if (query.equals("/insert")) {
					System.out.println("회원가입 실행");
				} else if (query.equals("/select")) {
					System.out.println("회원조회 실행");
				} else if (query.equals("/update")) {
					System.out.println("회원수정 실행");
				} else if (query.equals("/delete")) {
					System.out.println("회원탈퇴 실행");
				} else {
					System.out.println("입력 오류. 다시 입력해주세요.");
				}
			} else if (url.equals("exit")) {
				System.out.print("프로그램을 종료합니다");
				break;
			} else {
				System.out.println("입력 오류. 다시 입력해주세요.");
			}
		}
		input.close();
	}

}
