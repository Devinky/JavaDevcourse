package org.study.operatorEX;

import java.util.Scanner;

public class operator14 {
	
	public static void main(String[] args) {
		
		System.out.println("아스키코드");
		
		char c1 = 'A';
		int c1_int = 'A';
		/*
		System.out.println(c1 + ", " + c1_int);
		System.out.println('a' + 23);
		System.out.println((char)('a' + 25));
		System.out.println('z');
		System.out.println('A');
		System.out.println('Z');
		System.out.println('a' + 'A');
		System.out.println('z' + 'Z');
		*/
		System.out.println("=대문자 -> 소문자=");
		System.out.println('A');
		System.out.println('A' + 32);
		System.out.println((char)('A' + 32));
		System.out.println("=소문자 -> 대문자=");
		System.out.println('a');
		System.out.println((char)'a' - 32);
		
		System.out.println("대문자를 입력하세요(A~Z) : ");
		Scanner input = new Scanner(System.in);
				//Scanner에서 char형 입력받는 방법
		int ch = input.next().charAt(0);
		
		System.out.println("ch -> " + ch);
		System.out.println("ch -> " + (char)(ch+32));
		
		input.close();
		}

	}

