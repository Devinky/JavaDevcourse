package org.study.operatorEX;

public class operator10 {
	
	public static void main(String[] args) {
		
		System.out.println("쉬프트연산자");
		
		int i = 15;
		
		System.out.println("오른쪽 shift 연산자");
		System.out.println("15 : " + Integer.toBinaryString(i));
		System.out.println("15>>2 " + Integer.toBinaryString(i>>2));
		System.out.println("10진수 결과 : " + (i>>2));
		System.out.println("2진수 결과 : " + Integer.toBinaryString(i>>2));
		
		System.out.println("\n왼쪽 shift 연산자");
		System.out.println("15 : " + Integer.toBinaryString(i));
		System.out.println("15<<2 " + Integer.toBinaryString(i<<2));
		System.out.println("10진수 결과 : " + (i<<2));
		System.out.println("2진수 결과 : " + Integer.toBinaryString(i<<2));
		
		}

	}

