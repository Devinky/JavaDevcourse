package org.study.operatorEX;

import java.util.Scanner;

public class Quiz01 {
	
	public static void main(String[] args) {
		//대문자를 입력 받아서 소문자로 변경하여 콘솔에 출력하기
		//소문자를 입력 받아서 대문자로 변경하여 콘솔에 출력하기
		//Scanner, .next().CharAT(0)
		
		Scanner input = new Scanner(System.in);

		System.out.println("대문자를 소문자로");
		
		System.out.println("- 영어 대문자를 하나 입력하세요 : ");
		int ch = input.next().charAt(0);
		System.out.println((char) + (ch+32));
		
		System.out.println("\n소문자를 대문자로");
		
		System.out.println("- 영어 소문자를 하나 입력하세요 : ");
		int ch2 = input.next().charAt(0);
		
		System.out.println((char) + (ch2-32));
		
		input.close();
		
	}

}
