package org.study.OperatorEx;

import java.util.Scanner;

public class Quiz01 {
	
	public static void main(String[] args) {
		
		//Scanner를 이용해서 정수를 입력 받아 홀짝 구분 프로그램을 만들기
		//Scanner, if, 산술연산자
		//출력값이 짝수면 "짝수입니다" 홀수면 "홀수입니다"가 출력되게 하기
		
		Scanner scn = new Scanner(System.in);
		System.out.print("정수(양의 정수)를 입력하세요 : ");
		int num1 = scn.nextInt();
		
		if(num1 % 2 == 0) {
			System.out.println("입력하신 수는 짝수입니다.");
		}else {
			System.out.println("입력하신 수는 홀수입니다.");
		}
		
		scn.close();
	}

}
