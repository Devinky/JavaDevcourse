package org.study.basicPackage;

import java.util.Scanner;

public class StringEXQuiz02 {

	public static void main(String[] args) {
		System.out.println("회원 프로그램 실행\n");

		Scanner input = new Scanner(System.in);

		System.out.print("url을 입력하세요 : ");
		String url = input.next();
	
		System.out.println(url.length());
		
		System.out.println(url.substring(url.length()));
		
		String what = url.substring(url.length()-4);
		System.out.println(what);
		
		input.close();
	}

}
